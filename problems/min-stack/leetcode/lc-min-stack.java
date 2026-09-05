class MinStack {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> mainStack = new Stack<>();

    public MinStack() {
    }
    
    public void push(int value) {
        mainStack.push(value);
        if(minStack.isEmpty()){
            minStack.push(value);
        }
        else{
            int minValue = Math.min(value, minStack.peek());
            minStack.push(minValue);
        }
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
       return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */