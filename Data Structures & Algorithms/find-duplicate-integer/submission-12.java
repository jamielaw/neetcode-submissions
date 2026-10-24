class Solution {
    public int findDuplicate(int[] nums) {
        // 1,2,3,2,2
        // slow = 1, fast = 2
        // slow = 2, fast = 2
        int slow = 0;
        int fast = 0;
        for(int i = 0; i < nums.length; i++) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }
        int slow2 = 0;
        while(true) {
            slow = nums[slow];
            slow2 = nums[slow2];
            if(slow == slow2) return slow;
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
