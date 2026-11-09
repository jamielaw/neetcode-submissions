class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int midpoint = l + ((r - l) / 2);
            if(nums[midpoint] > target) {
                r = midpoint;
            } else if (nums[midpoint] < target) {
                l = midpoint+1;
            } else {
                return midpoint;
            }
        }
        return -1;
    }
}
