class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack = new Stack();
        min = new Stack();
    }
    
    public void push(int val) {
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.peek().equals(min.peek())) {
            min.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
