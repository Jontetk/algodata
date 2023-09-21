public class LinkedList {
    Cell first = null;
    LinkedList(){
        
    }
    LinkedList(int n){
        this(0,n);
    }

    LinkedList(int m, int n) {
        Cell last = null;
        for (int i = m; i < n; i++) {
            last = new Cell(i, last);
        }
        first = last;
        }
    public void add(int item) {
        this.first = new Cell(item, this.first);
    }
    public int length() {
        Cell next = this.first;
        int len = 0;
        while (next != null){
            next = next.tail;
            len++;
        }
        return len;
        }
    public boolean find(int item) {
        Cell next = this.first;
        while (next != null){
            if (next.head == item)
                return true;
            next = next.tail;   
        }
        return false;
        }
    public void remove(int item) {
        Cell next = this.first;
        Cell prev = null;
        while (next != null){
            if (next.head == item){
                if (prev != null)
                    prev.tail = next.tail;
                else
                    this.first = next.tail;
                break;
            }

            
            prev = next;
            next = next.tail;   
            
        }
    }
    public int removeIndex(int index) {
        int value = 0;
        Cell next = this.first;
        Cell prev = null;
        for (int i = 0; i<index &&next != null; i++) {
            prev = next;
            next = next.tail;
        }
        if (next != null && next.tail != null && prev != null) {
            value = next.head;
            prev.tail = next.tail;
        }
        else if (prev == null) {
            value = next.head;
            first = next.tail;
        }
        else if (next.tail == null) {
            value = next.head;
            prev.tail = null;
        }
        return value;


    }

    public void append(LinkedList b) {
        Cell next = this.first;
        while (next.tail != null) {
            next = next.tail;
        }
        next.tail = b.first;
        b.first = null;
    }
        
    }