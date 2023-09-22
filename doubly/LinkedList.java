public class LinkedList {
    Cell first = null;
    LinkedList(){
        
    }
    LinkedList(int n){
        this(0,n);
    }

    LinkedList(int m, int n) {
        Cell last = null;
        Cell lastcopy = null;
        for (int i = m; i < n; i++) {
            lastcopy = last;
            last = new Cell(i, last, null);
            if (lastcopy != null)
                lastcopy.prev = last;            
        }
        first = last;
        }
    public void add(int item) {
        Cell firstcopy = this.first;
        this.first = new Cell(item, this.first,null);
        if (firstcopy != null)
            firstcopy.prev = first;
    }
    public int length() {
        Cell next = this.first;
        int len = 0;
        while (next != null){
            next = next.next;
            len++;
        }
        return len;
        }
    public boolean find(int item) {
        Cell next = this.first;
        while (next != null){
            if (next.head == item)
                return true;
            next = next.next;   
        }
        return false;
        }
    public void remove(int item) {
        Cell next = this.first;
        while (next != null){
            if (next.head == item){
                if (next.prev != null){
                    next.prev.next = next.next;
                    next.next.prev = next.prev;
                    }
                else{
                    this.first = next.next;
                    this.first.prev = null;   
                }
                break;
            }

             
            
        }
    }
}