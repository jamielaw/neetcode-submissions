class Solution {
    public int findDuplicate(int[] nums) {

        //1,3,4,2,2
        //-1,3,-4,2,2
        //-1,3,-4,-2,2
        //
        for(int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i])-1;
            if(nums[value] < 0) return value+1;
            nums[value] = -nums[value];
        }
        return 0;
    }
}
