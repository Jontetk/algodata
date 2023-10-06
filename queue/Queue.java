public class Queue<T> {
    Node head;
    Node tail;

    private class Node {
        T item;
        Node next;

        private Node(T item, Node list) {

            this.item = item;
            this.next = list;
        }
    }

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void add(T item) {
        if(tail == null) {
            tail = new Node(item,null);
            head = tail;
        }
        else {
            tail.next = new Node(item,null);
            tail = tail.next;
        }
    }
    public T remove() {
        T returnValue = null;
        if (head!=null){
            returnValue = head.item;
        
            if(head.next != null) 
                head = head.next;
            else{
                head = null;
                tail = null;
            }
        }
        return returnValue;

    }
}
