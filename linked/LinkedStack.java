public class LinkedStack {
    LinkedList stack;
    LinkedStack() {
        this.stack = new LinkedList();
    }
    public void push(int value) {
        this.stack.add(value);
    }
    public int pop() {
        int value = this.stack.first.head;
        this.stack.first = this.stack.first.tail;
        return value;
    }


}
