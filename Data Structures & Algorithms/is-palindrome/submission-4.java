class Solution {
    public boolean isPalindrome(String s) {
        int leftPtr = 0;
        int rightPtr = s.length()-1;
        while(leftPtr != rightPtr) {
            Character leftChar = Character.toLowerCase(s.charAt(leftPtr));
            Character rightChar = Character.toLowerCase(s.charAt(rightPtr));
            while(!isAlphaNumeric(leftChar)) {
                leftPtr++;
                leftChar = Character.toLowerCase(s.charAt(leftPtr));
                if(leftPtr == rightPtr) return true;
            }
            while(!isAlphaNumeric(rightChar)) {
                rightPtr--;
                rightChar = Character.toLowerCase(s.charAt(rightPtr));
                if(rightPtr == leftPtr) return true;
            }
            if(leftChar != rightChar) return false;
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
