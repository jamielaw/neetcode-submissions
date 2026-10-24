class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            Integer numInteger = Integer.valueOf(num);
            if(numSet.contains(numInteger)) return true;
            numSet.add(numInteger);
        }
        return false;
    }
}