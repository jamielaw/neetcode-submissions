class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            numSet.add(num);
        }
        int highestCount = 1;
        for(int num : numSet) {
            if(!numSet.contains(num-1)) {
                // start of sequence
                int count = 1;
                while(numSet.contains(num+count)) {
                    count++;
                }
                if(count > highestCount) highestCount = count;
            }
        }
        return highestCount;
    } 

    public int longestConsecutiveOld(int[] nums) {
        // SpaceComplexity is O(n), TimeComplexity is O(nlogn) given that we are adding to this set n times and that insertion takes logn time
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
