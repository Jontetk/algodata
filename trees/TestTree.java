public class TestTree {
    public static void main(String[] args) {
        BinaryTree träd = new BinaryTree();
        träd.add(5,5);
        träd.add(4,4);
        träd.add(2,2);
        träd.add(3,3);
        träd.add(7,7);
        träd.add(6,6);
        träd.add(8,101);
        träd.root.print();
        System.out.println();
        System.out.println(träd.lookup(8));

    }
}
