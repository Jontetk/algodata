public class LinkedList<Obj> {
    Cell<Obj> first = null;
    LinkedList(){
        
    }


    public void add(Obj item) {
        this.first = new Cell<Obj>(item, this.first);
    }

    public Obj removeIndex(int index) {
        Obj value = null;
        Cell<Obj> next = this.first;
        Cell<Obj> prev = null;
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

        
    }