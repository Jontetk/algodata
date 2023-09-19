public class TestLinked {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 9;i>=0;i--) {
            list.add(i);
        }
        Cell next = list.first;
        while (next != null){
            System.out.println(next.head);

            next = next.tail;   
        }
        System.out.println(list.find(0));
        System.out.println(list.find(9));
        System.out.println(list.length());
        System.out.println(list.find(10));
        list.remove(9);
        next = list.first;
        while (next != null){
            System.out.println(next.head);

            next = next.tail;   
        }
        System.out.println(list.find(9));
        System.out.println(list.length());
        LinkedList list2 = new LinkedList(3,10);
        list.append(list2);
        next = list.first;
        while (next != null){
            System.out.println(next.head);

            next = next.tail;   
        }
    }
}
