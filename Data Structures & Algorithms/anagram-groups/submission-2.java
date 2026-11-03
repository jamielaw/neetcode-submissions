class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalList = new ArrayList<>();
        Map<Map, List<String>> finalMap = new HashMap<>();
        for(String str : strs) {
            Map<Character, Integer> charMap = new HashMap<>();
            for(Character c : str.toCharArray()) {
                charMap.merge(c, 1, Integer::sum);
            }
            finalMap.computeIfAbsent(charMap, k -> new ArrayList<>()).add(str);
        }
        for(List<String> strList: finalMap.values()) {
            finalList.add(strList);
        }
        return finalList;
    }
}
