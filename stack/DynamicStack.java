public class DynamicStack extends Stack{
    
    
    public DynamicStack(int size) {
        this.size = size;
        stack = new int[this.size];
        pointer = 0;
    }

    public DynamicStack() {
        this(4);
        
}


    public void push(int value){
    
            if (pointer >= size)
                increaseSize();
            stack[pointer] = value;
            pointer++;
    }    
    public int pop(){
        
        if (pointer > 0) {
            pointer--;
            if (size/(pointer+1) == 4)
                decreaseSize(); 
            return stack[pointer];
        }
        else 
            throw new StackException("Stack is empty, check input");

    }
    private void increaseSize() {

        size *= 2; 
        int[] newStack = new int[size];
        int index = 0;
        for (int copyItem : stack){
            newStack[index] = copyItem;
            index++;
        }
        stack = newStack;


        
    }
    private void decreaseSize() {

        size /= 2;
        int[] newStack = new int[size];
        for (int index = 0; index < size; index++){
            newStack[index] = stack[index];
        }
        stack = newStack;




    }


}

