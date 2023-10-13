public class PriorityListTwo {
    Node first;

    public PriorityListTwo() {
        this.first = null;
    }

    public void add(Integer value) {
        if (this.first == null) {
            this.first = new Node(value, null, null);
            return;
        }
        Node next = this.first;
        Node prev = null;
        while (next != null) {
            if(next.head>value){
                Node nodeToAdd = new Node(value,next,next.prev);
                if (next.prev != null){
                    next.prev.next = nodeToAdd;
                    next.prev = nodeToAdd;
                }
                else {
                    this.first = nodeToAdd;
                }
                break;
            }
            if(next.next == null) {
                prev = next;
           

            }
             next = next.next;
        }
        if (next == null) {
            prev.next = new Node(value, null, prev);
        }


    }
    public Integer remove() {
        if(this.first == null)
            return null;
        int returnValue = this.first.head;
        this.first = this.first.next;
        if(this.first != null) {
            this.first.prev = null;
        }
        return returnValue;

    }

}
