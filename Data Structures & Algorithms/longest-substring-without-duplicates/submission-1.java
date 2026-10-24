class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        Set<Character> charSet = new HashSet<>();
        int highestLength = 0;
        int leftPtr = 0;
        int rightPtr = 1;
        charSet.add(s.charAt(leftPtr));
        while(rightPtr < s.length()) {
            if(charSet.contains(s.charAt(rightPtr))) {
                charSet.remove(s.charAt(leftPtr));
                leftPtr++;
            } else {
                charSet.add(s.charAt(rightPtr));
                rightPtr++;
                highestLength = Math.max(highestLength, charSet.size());
            }
        }
        return highestLength;
    }
}
