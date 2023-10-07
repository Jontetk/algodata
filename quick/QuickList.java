public class QuickList {
    public static void sort(LinkedList list){
            if(list.first != null){

            
            LinkedList[] sortLists = partition(list);    
            sort(sortLists[1]);
            sort(sortLists[2]);
            list.first = sortLists[1].first;
            list.last = sortLists[1].last;
            list.append(sortLists[0]);
            list.append(sortLists[2]);
        }

    }

    private static LinkedList[] partition(LinkedList list){
        LinkedList pivot = new LinkedList();
        pivot.first = list.first;
        LinkedList smaller = new LinkedList();
        LinkedList larger = new LinkedList();
        Node next = list.first.next;
        list.first = list.first.next;
        pivot.first.next = null;
        pivot.last = pivot.first;

        while(next != null) {
            Node nextnext = next.next;
            list.unlink(next);
            if(next.head <= pivot.first.head) {
                smaller.insert(next);
            }
            else if(next.head > pivot.first.head) {
                larger.insert(next);
            }
            next = nextnext;

        }
        LinkedList returnArray[] = {pivot,smaller,larger};
        return returnArray;





        
    }
}