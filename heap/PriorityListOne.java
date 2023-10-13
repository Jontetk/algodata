public class PriorityListOne {

    Node first;
    
    public PriorityListOne() {
        this.first = null;
    }

    public void add(Integer value) {
        Node firstcopy = this.first;
        this.first = new Node(value, this.first,null);
        if (firstcopy != null)
            firstcopy.prev = first;
    }
    public Integer remove() {
        if (this.first == null)
            return null;
        Node priority = this.first;
        Node next = this.first;
        while(next != null) {
            if(priority.head > next.head) {
                priority = next;
            }
        next = next.next;
        }

        if (priority.prev != null)
            priority.prev.next = priority.next;
        if (priority.prev == null)
            this.first = this.first.next;
        if(priority.next != null)
            priority.next.prev = priority.prev;

        return priority.head;
    }
    
}