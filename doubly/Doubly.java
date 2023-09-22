public class Doubly {
    Cell first = null;
    Doubly(){
        
    }
    Doubly(int n){
        this(0,n);
    }

    Doubly(int m, int n) {
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
                if (next.prev != null && next.next != null){
                    next.prev.next = next.next;
                    next.next.prev = next.prev;
                    }
                else if(next.next == null) {
                    next.prev.next = null;
                }
                else{
                    this.first = next.next;
                    this.first.prev = null;   
                }
                break;
            }
            next = next.next;

             
            
        }
    }
    public void unlink(Cell cell) {
      if (cell.prev != null && cell.next != null){
                    cell.prev.next = cell.next;
                    cell.next.prev = cell.prev;
                    }
                else if(cell.next == null) {
                    cell.prev.next = null;
                }
                else{
                    this.first = cell.next;
                    this.first.prev = null;   
                }  
    }
    public void insert(Cell cell) {
        if(this.first!= null)
            this.first.prev = cell;
        cell.next = this.first;
        this.first = cell;
        this.first.prev = null; //maybe not neccesary, depends on function.
    }

}