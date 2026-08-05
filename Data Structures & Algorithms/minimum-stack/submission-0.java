class MinStack {
    Stack<Integer>stack;
    Stack<Integer>min;

    public MinStack() {
        stack=new Stack<>();
        min=new Stack<>();

        
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty())
        {
            min.push(val);
        }
        else if(val<=min.peek())
        {
            min.push(val);
        }
        else
        {
            min.push(min.peek());
        }
        
    }
    
    public void pop() {
        min.pop();
        stack.pop();
       
        
        
    }
    
    public int top() {
         return stack.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
