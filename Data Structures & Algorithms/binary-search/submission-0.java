class Solution {
    public int search(int[] nums, int target) {
        int highIndex = nums.length - 1;
        int lowIndex = 0;
        int result = -1;
        while(lowIndex <= highIndex) {
            int midpoint = (highIndex + lowIndex) / 2;  // int division always floors to 0
            if(nums[midpoint] == target) {
                return midpoint;
            } else if(nums[midpoint] > target) {
                highIndex = midpoint - 1;
            } else {
                lowIndex = midpoint + 1;
            }
        }
        return result;
    }
}
