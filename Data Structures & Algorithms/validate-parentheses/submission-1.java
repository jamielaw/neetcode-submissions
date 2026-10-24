class Solution {
    public boolean isValid(String s) {
        Deque<Character> charStack = new ArrayDeque<>();
        if(s.length() == 1) return false;
        for(Character c : s.toCharArray()) {
            if(c == '{' || c == '(' || c =='[') {
                charStack.push(c);
            } else {
                if(charStack.peek() == null) return false;
                if(c == '}') {
                    if(charStack.pop() != '{') return false;
                } 
                else if(c == ')') {
                    if(charStack.pop() != '(') return false;
                } 
                else if(c == ']') {
                    if(charStack.pop() != '[') return false;
                } 
            }
        }
        return(charStack.isEmpty());
    }
}
