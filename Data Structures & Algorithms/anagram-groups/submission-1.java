class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> charMaps = new HashMap<>();
        for (String str : strs) { 
            Map<Character, Integer> charCount = new HashMap<>();
            for(Character c : str.toCharArray()) {
                charCount.merge(c, 1, Integer::sum);
            } 
            charMaps.computeIfAbsent(charCount, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(charMaps.values());
    }
}
