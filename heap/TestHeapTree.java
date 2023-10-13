public class TestHeapTree {
    public static void main(String[] args) {
        HeapTree trefan = new HeapTree();
        trefan.add(10);
        trefan.add(15);
        trefan.add(5);
        trefan.add(1);
        trefan.add(6);
        trefan.add(11);
        trefan.add(7);
        trefan.add(8);
        trefan.add(9);
        trefan.add(2);
        trefan.add(20);
        trefan.add(22);
        
        System.out.println(trefan.remove());
        System.out.println(trefan.remove());
        System.out.println(trefan.remove());
        System.out.println(trefan.remove());
        System.out.println(trefan.remove());
        System.out.println(trefan.remove());
        System.out.println(trefan.remove());
        trefan.add(9);
        trefan.add(2);
        trefan.add(1);
        System.out.println(trefan.remove());
        trefan.add(30);
        trefan.add(27);
        System.out.println(trefan.remove());
        trefan.add(-7);
        trefan.add(58);
        System.out.println(trefan.remove());
        trefan.push(6);
        System.out.println(trefan.remove());
                System.out.println(trefan.remove());
                        System.out.println(trefan.remove());
                                System.out.println(trefan.remove());
                                        System.out.println(trefan.remove());
                                                System.out.println(trefan.remove());
                                                        System.out.println(trefan.remove());


    }
}
