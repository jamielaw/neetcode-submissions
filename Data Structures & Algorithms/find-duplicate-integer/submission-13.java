class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }
        slow = 0;
        while(true) {
            fast = nums[fast];
            slow = nums[slow];
            if(slow == fast) return slow;
        }
    }

    public int findDuplicateOld(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i])-1;
            if(nums[value] < 0) return value+1;
            nums[value] = -nums[value];
        }
        return 0;
    }
}
