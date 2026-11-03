class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int res = 0;
        int maxFChar = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for(int r = 0; r < s.length(); r++) {
            System.out.println(s.charAt(r));
            charMap.merge(s.charAt(r), 1, Integer::sum);
            maxFChar = Math.max(maxFChar, charMap.get(s.charAt(r)));

            while((r - l - maxFChar + 1) > k) {
                charMap.merge(s.charAt(l), -1, Integer::sum);
                l++;
            }

            res = Math.max(res, r - l +1);
        }
        return res;
    }
    // ABCABBA k=2
}
