class MyQueue {
      Stack<Integer>st1;
      Stack<Integer>st2;
    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    
    public void push(int x) {
        if(empty()){
            st1.push(x);
            return;
        }
        // ele r present in stck,
        // first push all ele to st2, push x into st1
        // then push all st2 ele back to st1
        while(st1.size() > 0){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
        
    }
    
    public int pop() {
        return st1.pop();

    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        if(st1.size()==0){
            return true;
        }
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
