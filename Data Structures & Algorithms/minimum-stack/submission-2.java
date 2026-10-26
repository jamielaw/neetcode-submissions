class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    int currentMin;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        currentMin = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        if(val < currentMin) currentMin = val;
        minStack.push(currentMin);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        if(stack.isEmpty()) {
            currentMin = Integer.MAX_VALUE; 
        } else {
            currentMin = minStack.peek();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
