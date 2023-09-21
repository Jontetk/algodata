public class LinkedStack {
    LinkedList stack;
    LinkedStack() {
        this.stack = new LinkedList();
    }
    public void push(int value) {
        this.stack.add(value);
    }
    public int pop() {
    
        return this.stack.removeIndex(0);
    }


}
