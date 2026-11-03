class Solution {
    public boolean isPalindrome(String s) {
        int leftPtr = 0;
        int rightPtr = s.length()-1;
        s = s.toLowerCase();
        while(leftPtr < rightPtr) {
            while(!isAlphaNumeric(s.charAt(leftPtr)) && leftPtr < rightPtr) {
                leftPtr++;
            }
            while(!isAlphaNumeric(s.charAt(rightPtr)) && leftPtr < rightPtr) {
                rightPtr--;
            }
            if(s.charAt(leftPtr) != s.charAt(rightPtr)) return false;
            leftPtr++;
            rightPtr--;
        }
        return true;
    }

    private boolean isAlphaNumeric(Character c) {
        return (c >= 'a' && c <='z' || c >= '0' & c <='9');
    }
}
