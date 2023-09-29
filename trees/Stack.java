public class Stack<Obj> {
    LinkedList<Obj> stackList;
    int stackCounter;
    Stack() {
        this.stackList = new LinkedList<Obj>();
    }
    public void push(Obj value) {
        this.stackList.add(value);
    }
    public Obj pop() {

        return this.stackList.removeIndex(0);
    }



}
