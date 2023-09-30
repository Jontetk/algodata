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
        tree.add(10, 1010);
        tree.add(6, 106);
        tree.add(9, 109);
        tree.add(7, 107);
        tree.add(8, 108);
        tree.add(5, 105);
        tree.add(3, 103);
        tree.add(1, 101);
        tree.add(2, 102);
        tree.add(4, 104);
        tree.add(99, 1099);
        tree.add(12,1012 );
        tree.add(11, 1011);
        tree.add(98, 1098);

        for (int i : tree){
            System.out.println("next value " + i);
        }

        for (int k : testtre){
            System.out.println("next value " + k);
            if(k==105){
                testtre.add(500,105555);
            }
        }

    }
}
