class Solution {
    public int[] productExceptSelf(int[] nums) {
        // naive approach: for each int, iterate through and multiply by each other, O(n^2)
        int totalProduct = 1;
        int zeroCount = 0;
        for(int num : nums) {
            if(num==0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }
        if(zeroCount >= 2) return new int[nums.length]; // they're all gonna be 0
        if(zeroCount == 0) {
            for(int i = 0; i < nums.length; i++) {
                nums[i] = totalProduct / nums[i];
            }
        } else {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    nums[i] = totalProduct;
                } else {
                    nums[i] = 0;
                }
            }
        }
        return nums;
    }
}  
