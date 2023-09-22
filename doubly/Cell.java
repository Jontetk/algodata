public class Cell {
    int head;
    Cell next;
    Cell prev;

    Cell(int val, Cell next, Cell prev) {
        head = val;
        this.next = next;
        this.prev = prev;
        
    }

    
}