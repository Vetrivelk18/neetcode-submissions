class MinStack {
       private Stack<Integer> stack;
      private Stack<Integer> minStack;
    public MinStack() {
      
      
        stack = new Stack<>();
        minStack = new Stack<>();
      
    }
    
    public void push(int val) {
        //Stack<Integer>stack = new Stack<>();
        stack.push(val);
        if(minStack.isEmpty()||val<=minStack.peek()){
             minStack.push(val);
        }
    }
    
    public void pop() {
        int cha = stack.pop();
        if(minStack.peek()==cha){
             minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
       return  minStack.peek();
    }
}
