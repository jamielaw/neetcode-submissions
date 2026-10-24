class Solution {
    public boolean isPalindrome(String s) {
        String strLower = s.toLowerCase();
        int leftPtr = 0;
        int rightPtr = s.length()-1;
        while(leftPtr != rightPtr) {
            while(!isAlphaNumeric(strLower.charAt(leftPtr))) {
                leftPtr++;
                if(leftPtr == rightPtr) return true;
            }
            while(!isAlphaNumeric(strLower.charAt(rightPtr))) {
                rightPtr--;
                if(rightPtr == leftPtr) return true;
            }
            if(strLower.charAt(leftPtr) != strLower.charAt(rightPtr)) return false;
            leftPtr++;
            if(leftPtr == rightPtr) return true;
            rightPtr--; 
        }
        return true;
    }

    private boolean isAlphaNumeric(Character c) {
        return(c >= 'a' && c <= 'z' || c >='0' && c<='9');
    }
}
