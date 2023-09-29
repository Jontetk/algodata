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
        BinaryTree tree = new BinaryTree();
        tree.add(5,105);
        tree.add(2,102);
        tree.add(7,107);
        tree.add(1,101);
        tree.add(8,108);
        tree.add(6,106);
        tree.add(3,103);
        for (int i : tree){
            System.out.println("next value " + i);
        }
        System.out.println();
        BinaryTree testtre = new BinaryTree();
        testtre.add(10, 1010);
        testtre.add(6, 106);
        testtre.add(9, 109);
        testtre.add(7, 107);
        testtre.add(8, 108);
        testtre.add(5, 105);
        testtre.add(3, 103);
        testtre.add(1, 101);
        testtre.add(2, 102);
        testtre.add(4, 104);
        testtre.add(99, 1099);
        testtre.add(12,1012 );
        testtre.add(11, 1011);
        testtre.add(98, 1098);



        for (int k : testtre){
            System.out.println("next value " + k);
            if(k==105){
                testtre.add(500,105555);
            }
        }

    }
}
