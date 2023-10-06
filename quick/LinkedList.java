public class LinkedList {
    
    
    
    Node last = null;
    Node first = null;
    LinkedList(){
        
    }
    LinkedList(int n){
        this(0,n);
    }

    LinkedList(int m, int n) {
        this.last = new Node(m, null);
        Node prev = last;
        for (int i = m+1; i < n; i++) {

            prev = new Node(i, prev);
        }
        first = prev;
        }
    public void add(int item) {
        this.first = new Node(item, this.first);
        if(last == null)
            last = first;
    }

    public void append(LinkedList b) {
        if(b.first != null) {
            if(this.last != null) {

                this.last.next = b.first;
                this.last = b.last;
                b.first = null;
                }
            else {
                this.first = b.first;
                this.last = b.last;
                b.first = null;
            }
    }
    }

    public void unlink(Node node) {
        Node next = this.first;
        Node prev = null;
        while (next != null){
            if (next.equals(node)){
                if (prev != null) {
                    prev.next = next.next;
                    next.next = null;
                    if (next.next == null) {
                        this.last = prev;
                    }
                }
                else {
                    this.first = next.next;
                    next.next = null;
                    if (next.next == null) {
                        this.last = this.first;
                    }
                }
                break;
            }

            
            prev = next;
            next = next.next;   
            
        }
    }
    public void insert(Node node) {
        if(node != null) {
            if(this.last != null) {
                this.last.next = node;
                this.last = node;
            }
            else {
                this.first = node;
                this.last = node;
            }
        }
    }
    
        
    }