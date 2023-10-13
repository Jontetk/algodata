public class TestHeap {
    public static void main(String[] args) {

        PriorityListTwo prio2 = new PriorityListTwo();

      
        prio2.add(1);
        
        prio2.add(5);
        
        prio2.add(3);
        
        prio2.add(10);
        
        prio2.add(2);

        System.out.println(prio2.remove());
                System.out.println(prio2.remove());
                        System.out.println(prio2.remove());
                                System.out.println(prio2.remove());
                                        System.out.println(prio2.remove());
                                                System.out.println(prio2.remove());
                                                        System.out.println(prio2.remove());
        prio2.add(5);
        prio2.add(2);
                System.out.println(prio2.remove());        System.out.println(prio2.remove());        System.out.println(prio2.remove());

        
    }
}
