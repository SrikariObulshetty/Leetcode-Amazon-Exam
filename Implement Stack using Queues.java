class MyStack {
       Queue<Integer>q1;
       Queue<Integer>q2;
    public MyStack() {
        q1= new LinkedList<>();
        q2=new  LinkedList<>();
    }
    
    public void push(int x) {
        if(empty()){
            q1.offer(x);
            return;
        }
        while(q1.size() > 0){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while(q2.size() > 0){
            q1.add(q2.remove());
        }

    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
         if(q1.size()==0){
            return true;
         }
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
