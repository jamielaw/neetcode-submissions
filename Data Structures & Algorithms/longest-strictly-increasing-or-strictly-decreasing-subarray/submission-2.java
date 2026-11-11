class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longestIncreasing = 1;
        int longestDecreasing = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                longestIncreasing++;
                longestDecreasing = 1;
            } else if(nums[i] < nums[i-1]) {
                longestDecreasing++;
                longestIncreasing = 1;
            } else {
                longestIncreasing = 1;
                longestDecreasing = 1;
            }
            max = Math.max(max, longestDecreasing);
            max = Math.max(max, longestIncreasing);
        }
        return max;
    }
}