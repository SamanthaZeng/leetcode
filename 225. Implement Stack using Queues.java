class MyStack {

    Queue<Integer>input;
    Queue<Integer>output;
    /** Initialize your data structure here. */
    public MyStack() {
        input = new LinkedList<Integer>();
        output = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        input.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(input.size()>1){
            int top = input.poll();
            output.offer(top);
        }
        int top = input.poll();
        Queue<Integer>temp = input;
        input = output;
        output = temp;
        return top;
    }
    
    /** Get the top element. */
    public int top() {
        while(input.size()>1){
            int top = input.poll();
            output.offer(top);
        }
        int top = input.peek();
        Queue<Integer>temp = new LinkedList<Integer>();
        input = output;
        output = temp;
        input.offer(top);
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(input.size()==0)
            return true;
        else 
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
