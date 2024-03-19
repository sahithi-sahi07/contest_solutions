import java.util.Stack;

class MyQueue {
    Stack<Integer> inputStack = new Stack<>();
    Stack<Integer> outputStack = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        if(!outputStack.isEmpty()){
            return outputStack.pop();
        }else{
            while(!inputStack.isEmpty()){
                outputStack.add(inputStack.pop());
            }
            return outputStack.pop();
        }
    }
    
    public int peek() {
        if(!outputStack.isEmpty()){
            return outputStack.peek();
        }else{
            while(!inputStack.isEmpty()){
                outputStack.add(inputStack.pop());
            }
            return outputStack.peek();
        }
    }
    
    public boolean empty() {
        return (outputStack.isEmpty() && inputStack.isEmpty());
    }
}
