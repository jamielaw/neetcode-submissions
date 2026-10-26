class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1) return Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.parseInt(tokens[0]));
        stack.push(Integer.parseInt(tokens[1]));
        for(String token : tokens) {
            if(token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(val2 - val1);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(val2 / val1);
            } else { // can only be numeric based on constraints
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
