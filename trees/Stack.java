public class Stack<Obj> {
    LinkedList<Obj> stack;
    Stack() {
        this.stack = new LinkedList<Obj>();
    }
    public void push(Obj value) {
        this.stack.add(value);
    }
    public Obj pop() {
    
        return this.stack.removeIndex(0);
    }


}
