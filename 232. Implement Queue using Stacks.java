class MyQueue {
Stack<Integer>input;
Stack<Integer>output;
    /** Initialize your data structure here. */
    public MyQueue() {
        input = new Stack<Integer>();
        output = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int x;
        if(!output.empty())
            x = output.pop();
        else{
            while(!input.empty()){
                int temp = input.pop();
                output.push(temp);
            }
            x = output.pop();
        }
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
        int x;
        if(!output.empty())
            x = output.peek();
        else{
            while(!input.empty()){
                int temp = input.pop();
                output.push(temp);
            }
            x = output.peek();
        }
        return x;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(input.empty()&&output.empty())
            return true;
        else
            return false;
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
