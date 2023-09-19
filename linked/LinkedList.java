public class LinkedList {
    Cell first = null;
    private class Cell {
        int head;
        Cell tail;
    
        Cell(int val, Cell tl) {
            head = val;
            tail = tl;
        }
    
        
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
        while (next != null){
            if (next.head == item){
                next.tail = next.tail.tail;
                break;
            }

            next = next.tail;   
        }
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