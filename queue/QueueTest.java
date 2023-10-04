public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> ko = new Queue<Integer>();
        ko.add(5);
        ko.add(6);
        ko.add(7);
        
        System.out.println(ko.remove());
        System.out.println(ko.remove());
        System.out.println(ko.remove());
        System.out.println(ko.remove());
        ko.add(8);
        ko.add(2);
        System.out.println(ko.remove());
        System.out.println(ko.remove());
        System.out.println(ko.remove());
        
        BinaryTree trefan = new BinaryTree();
        trefan.add(5, 105);
        trefan.add(8,108);
        trefan.add(3,103);
        trefan.add(4,104);
        trefan.add(1,101);
        trefan.add(2,102);
        for (int i : trefan){
            System.out.println("next value " + i);
        }

        ArrayQueue ko2 = new ArrayQueue(4); 
        ko2.add(1);
        ko2.add(2);
        ko2.add(3);
        ko2.add(4);
        System.out.println(ko2.remove());
        ko2.add(5);
        System.out.println(ko2.remove());
        ko2.add(6);
        System.out.println(ko2.remove());
        ko2.add(7);
        System.out.println(ko2.remove());
        ko2.add(8);
        System.out.println(ko2.remove());
        ko2.add(9);
        ko2.add(10);
        ko2.add(11);
        ko2.add(13);
        ko2.add(14);
        ko2.add(15);
        ko2.add(156);
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);
        ko2.add(1);
        ko2.add(2);
        ko2.add(3);
        ko2.add(4);
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        ko2.add(156);
        ko2.add(156);
        ko2.add(156);

 System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
        System.out.println(ko2.remove());
System.out.println(ko2.remove());
System.out.println(ko2.remove());
System.out.println(ko2.remove());
    }
    
}