class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int l = i+1;
            int r = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1]) continue; // already evaluated
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    while(nums[l] == nums[l-1] && l < r) {
                        l++;
                    }
                    // Could move r back also given l would be increasing
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
    }
}
