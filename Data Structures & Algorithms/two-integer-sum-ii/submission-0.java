class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPtr = 0;
        int rightPtr = numbers.length-1;
        while(leftPtr != rightPtr) {
            int sum = numbers[leftPtr] + numbers[rightPtr];
            if(sum == target) return new int[]{leftPtr+1, rightPtr+1};
            if(sum < target) leftPtr++;
            if(sum > target) rightPtr--;
        }
        return new int[2];
    }
}
