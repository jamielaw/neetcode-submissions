class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            if(numSet.contains(Integer.valueOf(num))) return true;
            numSet.add(Integer.valueOf(num));
        }
        return false;
    }
}