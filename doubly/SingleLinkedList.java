public class SingleLinkedList {
    CellSingle first = null;
    SingleLinkedList(){
        
    }
    SingleLinkedList(int n){
        this(0,n);
    }

    SingleLinkedList(int m, int n) {
        CellSingle last = null;
        for (int i = m; i < n; i++) {
            last = new CellSingle(i, last);
        }
        first = last;
        }
    public void add(int item) {
        this.first = new CellSingle(item, this.first);
    }
    public int length() {
        CellSingle next = this.first;
        int len = 0;
        while (next != null){
            next = next.tail;
            len++;
        }
        return len;
        }
    public boolean find(int item) {
        CellSingle next = this.first;
        while (next != null){
            if (next.head == item)
                return true;
            next = next.tail;   
        }
        return false;
        }
    public void remove(int item) {
        CellSingle next = this.first;
        CellSingle prev = null;
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
        CellSingle next = this.first;
        CellSingle prev = null;
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

    public void append(SingleLinkedList b) {
        CellSingle next = this.first;
        while (next.tail != null) {
            next = next.tail;
        }
        next.tail = b.first;
        b.first = null;
    }

    public void unlink(CellSingle cell) {
        CellSingle next = this.first;
        CellSingle prev = null;
        while (next != null){
            if (next.equals(cell)){
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
    public void insert(CellSingle cell) {
        cell.tail = this.first;
        this.first = cell;

    }
        
    }