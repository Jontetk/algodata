import java.util.Iterator;

public class BinaryTree implements Iterable<Integer>{

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void add(Integer key, Integer value) {
        if (root == null) {
            root = new Node(key, value);
        } 
        else {
            Node curr = root;
            boolean found = false;
            Node prev = null;
            while (curr != null && found == false) {
                if (curr.key < key) {
                    prev = curr;
                    curr = curr.right;
                }
                else if (curr.key > key) {
                    prev = curr;
                    curr = curr.left;
                }                
                else {
                    prev = curr;
                    curr.value = value;
                    found = true;
                }
            }
            if (curr == null) {
                 curr = new Node(key, value);
                if (curr.key < prev.key)
                    prev.left = curr;
                else
                    prev.right = curr;
            }
        }
    }

    public Integer lookup(Integer key) {
        if (root == null) {
            return null;
        } 
        
        else {
            Node curr = root;

            while (curr != null) {
                if (curr.key < key) {
                    curr = curr.right;
                } 
                
                else if (curr.key > key) {
                    curr = curr.left;
                } 
                
                else {
                    return curr.value;
                }
            }
            return null;
        }  

    }
    public Iterator <Integer> iterator() {
        return new TreeIterator(this.root);
    }
}
