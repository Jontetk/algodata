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
    
    }
    
}