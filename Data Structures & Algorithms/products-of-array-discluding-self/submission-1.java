class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProductArray = new int[nums.length];
        int[] rightProductArray = new int[nums.length];
        leftProductArray[0] = nums[0];
        rightProductArray[nums.length-1] = nums[nums.length-1];
        for(int i = 1; i < nums.length; i++) {
            leftProductArray[i] = leftProductArray[i-1] * nums[i];
        }
        for(int j = nums.length-2; j >= 0; j--) {
            rightProductArray[j] = rightProductArray[j+1] * nums[j];
        }
        nums[0] = rightProductArray[1];
        nums[nums.length-1] = leftProductArray[nums.length-2];
        for(int x = 1; x < nums.length-1; x++) {
            nums[x] = leftProductArray[x-1] * rightProductArray[x+1];
        }
        return nums;
    }

    public int[] productExceptSelfOld(int[] nums) {
        // naive approach: for each int, iterate through and multiply by each other, O(n^2)
        // alternative approach: multiply the total product, while also keeping track of 0s
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
