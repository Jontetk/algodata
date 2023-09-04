public class StaticStack extends Stack {
    

    public StaticStack(int size) {
        this.size = size;
        stack = new int[size];
        pointer = 0;
}       

    public void push(int value){
    
            if (pointer >= this.size)
                throw new StackException("Stack too small");
            stack[pointer] = value;
            pointer++;
    }    
    public int pop(){
        if (pointer > 0) {
            pointer--;
            return stack[pointer];
        }
        else 
            throw new StackException("Stack is empty, check input");

    }
}