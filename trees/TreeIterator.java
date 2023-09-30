import java.util.Iterator;


public class TreeIterator implements Iterator<Integer> {
    private Node next;
    private Node root;
    private Stack<Node> stack;
    public TreeIterator(Node root) {
        stack = new Stack<Node>();
        next = root;
        this.root = root;
        stack.push(next);
        if(next!=null){
            while (next.left!=null) {
                next = next.left;
                stack.push(next);
            }
        }
    }
    @Override
    public boolean hasNext() {
            return next!= null;
    }
    @Override
        public Integer next() {
            Node returnNode = stack.pop();
            
            if(next.right != null && next.right != returnNode){
                stack.push(next);
                next = next.right;
                stack.push(next);
                while (next.left!=null) {
                    next = next.left;
                    stack.push(next);
                }
            }
            else if(next.key!=root.key){
                next = stack.pop();
                while(next!=root&&(next.right==null||next.right.key<=returnNode.key)
                &&!(next.key>returnNode.key)){    
                    next = stack.pop();
                }
                stack.push(next);
            }
            
            if(next == root && (root.key < returnNode.key||root.right==null))
                next = null;

            return returnNode.value;
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
