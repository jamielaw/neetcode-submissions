class Solution {
    // public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length()) return false;
    //     Map<Character, Integer> charMap = new HashMap<>();
    //     for(Character c : s.toCharArray()) {
    //         charMap.merge(c, 1, Integer::sum);
    //     }
    //     for(Character c: t.toCharArray()) {
    //         Integer currentCount = charMap.get(c);
    //         if(currentCount == null || currentCount == 0) return false;
    //         charMap.put(c, currentCount-1);
    //     }
    //     return true;
    // }
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
            int[] counts = new int[26];
            for(int i = 0; i < s.length(); i++) {
                counts[s.charAt(i) -'a']++;
                counts[t.charAt(i) -'a']--;
            }
            for(int count: counts) {
                if(count!=0) return false;
            }
            return true;
    }
}
