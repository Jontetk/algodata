public class TestQuick {
    public static void main(String[] args) {
        int[] array = {5,4,33,3,3,5,-32,2,1};

        LinkedList list = new LinkedList();
        
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(7);
        QuickList.sort(list);
        Node next = list.first;
        while(next != null) {
            System.out.println(next.head);
            next = next.next;
        }



        System.out.println(list.last.head);




    }
}
