public class TestDoubly {


    public static void printLinked(Doubly list) {
        System.out.println();
        Cell next = list.first;
        Cell prev = null;
        while (next!= null) {
            System.out.println(next.head);
            prev = next;
            next = next.next;

        }
        next = prev;
        System.out.println();
        while (next!= null) {
            System.out.println(next.head);
            next=next.prev;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Doubly list = new Doubly(0,10);
        printLinked(list);
        System.out.println(list.length());
        list.add(100);
        printLinked(list);
        System.out.println(list.length());
        System.out.println(list.find(0));
        System.out.println(list.find(100));
        System.out.println(list.find(10));
        list.remove(5);
        System.out.println(list.length());
        list.remove(100);
        list.remove(0);
        printLinked(list);
       
        Cell next = list.first;
        Cell prev = null;
        while (next!= null) {
            prev = next;
            next = next.next;

        }
        
        next = prev;
        Cell end = next;
        list.unlink(next.prev.prev.prev);
        list.unlink(end);
        Cell savedFirst = list.first;
        list.unlink(list.first);
        
        printLinked(list);
        list.insert(savedFirst);
        printLinked(list);

        SingleLinkedList listSingle = new SingleLinkedList(10);
        



        
        System.out.println();
        CellSingle nextsing = listSingle.first;
        while (nextsing!= null) {
            System.out.println(nextsing.head);
            nextsing = nextsing.tail;
            
        }
        CellSingle savedSingle = listSingle.first;
        listSingle.unlink(listSingle.first);
        listSingle.unlink(listSingle.first.tail.tail.tail);
        listSingle.unlink(listSingle.first.tail.tail.tail);

        listSingle.unlink(listSingle.first.tail.tail.tail.tail.tail);
        listSingle.unlink(listSingle.first.tail.tail.tail.tail.tail);
        listSingle.unlink(listSingle.first.tail.tail.tail.tail.tail);
        System.out.println();
        nextsing = listSingle.first;
        while (nextsing!= null) {
            System.out.println(nextsing.head);
            nextsing = nextsing.tail;
        }
        listSingle.insert(savedSingle);
    
        System.out.println();
        nextsing = listSingle.first;
        while (nextsing!= null) {
            System.out.println(nextsing.head);
            nextsing = nextsing.tail;
        }

    }
}
