/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // sort intervals by start time
        // if start time of an interval is before end time of previous interval, then overlap
        intervals.sort(Comparator.comparingInt(i -> i.start));
        int prevEnd = -1;
        for(Interval i : intervals) {
            if(i.start < prevEnd) return false;
            prevEnd = i.end;
        }
        return true;
    }
}
