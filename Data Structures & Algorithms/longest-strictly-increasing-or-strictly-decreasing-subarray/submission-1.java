class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longest = 1;
        for(int l = 0; l < nums.length; l++) {
            int r = l+1;
            while(r < nums.length && nums[r] > nums[r-1]) {
                r++;
            }
            longest = Math.max(longest, r-l);
            r = l+1;
            while(r < nums.length && nums[r] < nums[r-1]) {
                r++;
            }
            longest = Math.max(longest, r-l);
        }
        return longest;
    }
}