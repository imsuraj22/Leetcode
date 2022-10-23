class MyQueue {
    Stack<Integer> input=new Stack();
    Stack<Integer> output=new Stack();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
        
    }
    
    public int pop() {
       // int temp=0;
        if(!output.isEmpty()){
            
           return output.pop();

            //return temp;
        }else{
            while(!input.isEmpty()){
                output.push(input.peek());
                input.pop();
            }
        }
        return output.pop();
     
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.peek());
                input.pop();
            }
        }
        if(!output.isEmpty()){
            return output.peek();
        }
        else if(!input.isEmpty()){
            return input.peek();
        } 
        return -1;
        
    }
    
    public boolean empty() {
        if(output.isEmpty() && input.isEmpty()) return true;

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