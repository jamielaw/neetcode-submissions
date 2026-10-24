class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap<>();
        for(int num : nums) {
            if(numMap.get(Integer.valueOf(num)) != null) return true;
            numMap.put(Integer.valueOf(num), true);
        }
        return false;
    }
}