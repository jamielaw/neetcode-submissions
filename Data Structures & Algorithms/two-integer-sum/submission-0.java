class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenMap = new HashMap<Integer, Integer>();

        for(Integer i = 0; i < nums.length; i++) {
            Integer compatibleNum = target - nums[i];
            if(seenMap.containsKey(compatibleNum)) return new int[]{seenMap.get(compatibleNum), i};
            seenMap.put(Integer.valueOf(nums[i]), i);
        }
        return null; //base case, shouldnt happen
    }
}
