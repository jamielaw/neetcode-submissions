class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeSet<Integer> intSet = new TreeSet<>();
        for(int num : nums) {
            intSet.add(num); // we don't care about dupes
        }
        int prev = intSet.first();
        int count = 1;
        int highestCount = 1;
        for(Integer i : intSet) {
            if(i == prev+1) {
                count++;
            } else {
                count = 1;
            }
            if(count > highestCount) highestCount = count;
            prev = i;
        }
        return highestCount;
    }
}
