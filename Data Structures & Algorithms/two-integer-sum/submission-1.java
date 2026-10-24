class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int diff = target - currentNum;
            if(seenMap.containsKey(diff)) return new int[]{seenMap.get(diff), i};
            seenMap.put(currentNum, i);
        }
        return new int[] {}; //base case, shouldnt happen
    }
}
