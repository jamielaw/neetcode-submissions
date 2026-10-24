class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> charMap = new HashMap<>();
        Map<Character, Integer> charMap2 = new HashMap<>();
        for(Character c : s.toCharArray()) {
            charMap.merge(c, 1, Integer::sum);
        }
        // we could optimise this space wise by using one map
        for(Character c: t.toCharArray()) {
            Integer currentCount = charMap.get(c);
            if(currentCount == null || currentCount == 0) return false;
            charMap.put(c, currentCount-1);
        }
        return true;
    }
}
