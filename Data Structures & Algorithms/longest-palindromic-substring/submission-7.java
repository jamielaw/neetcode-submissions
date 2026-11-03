class Solution {
    public String longestPalindrome(String s) {
        int longestLeft = 0;
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > maxLen) {
                    maxLen = r - l + 1;
                    longestLeft = l;
                }
                l--;
                r++;
            }
            l = i;
            r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > maxLen) {
                    maxLen = r - l + 1;
                    longestLeft = l;
                }
                l--;
                r++;
            }
        }
        return s.substring(longestLeft, longestLeft+maxLen);
    }
}
