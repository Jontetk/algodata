public class Cell<Obj> {
    Obj head;
    Cell<Obj> tail;

    Cell(Obj val, Cell<Obj> tl) {
        head = val;
        tail = tl;
    }

    
}