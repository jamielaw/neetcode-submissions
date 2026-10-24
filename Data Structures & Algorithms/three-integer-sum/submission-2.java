class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // set won't work, because lists can only be equal if they are in same order
        List<List<Integer>> finalList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break; // anything more than 0 can't be zero sum
            if(i > 0 && nums[i] == nums[i-1]) continue; // we already calculated this
            int leftPtr = i + 1;
            int rightPtr = nums.length-1;
            while(leftPtr < rightPtr) {
                int sum = nums[i] + nums[leftPtr] + nums[rightPtr];
                if(sum == 0) {
                    finalList.add(List.of(nums[i], nums[leftPtr], nums[rightPtr]));
                    leftPtr++;
                    while(leftPtr < rightPtr && nums[leftPtr] == nums[leftPtr-1]) {
                        // shift the leftPtr until we get to the next sequential number
                        leftPtr++;
                    }
                } else if (sum > 0) {
                    rightPtr--;
                } else if (sum < 0) {
                    leftPtr++;
                }
            }
        }
        return finalList;
    }
}
