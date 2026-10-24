class Solution {
    public boolean isValid(String s) {
        Deque<Character> charStack = new ArrayDeque<>();
        for(Character c : s.toCharArray()) {
            if(c == '{') {
                charStack.push('}');
            } else if(c=='(') {
                charStack.push(')');
            } else if(c=='[') {
                charStack.push(']');
            } else {
                if(charStack.isEmpty() || charStack.pop() != c) {
                    return false;
                }
            }
        }
        return(charStack.isEmpty());
    }
}
