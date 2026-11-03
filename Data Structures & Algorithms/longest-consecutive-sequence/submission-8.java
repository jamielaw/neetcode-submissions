class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            numSet.add(num);
        }
        int max = 1;
        for(int num : numSet) {
            int counter = 1;
            if(!numSet.contains(num-1)) {
                while(numSet.contains(num+counter)) {
                    counter++;
                }
            }
            max = Math.max(max, counter);
        }
        return max;
    }
}
