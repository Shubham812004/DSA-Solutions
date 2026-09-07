class MyQueue {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();

    public MyQueue() {
    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                int value = stackIn.pop();
                stackOut.push(value);
            }
        }
        return stackOut.pop();   
    }
    
    public int peek() {
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                int value = stackIn.pop();
                stackOut.push(value);
            }
        }
        return stackOut.peek();
    }
    
    public boolean empty() {
        return stackOut.isEmpty() && stackIn.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */