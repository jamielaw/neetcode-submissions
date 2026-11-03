class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> finalMap = new HashMap<>();
        for(String str : strs) {
            int[] charCounts = new int[26];
            for(Character c : str.toCharArray()) {
                charCounts[c - 'a']++;
            }
            String key = Arrays.toString(charCounts);
            finalMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(finalMap.values());
    }
}
