class Solution {
    public int countSubstrings(String s) {
        int palindromes = 0; // always add 1 for the end
        for(int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            // odd
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                palindromes++;
                left--;
                right++;
            }

            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                palindromes++;
                left--;
                right++;
            }
            // char by itself is a palindrome
            palindromes++;
        }
        return palindromes;
    }
}
