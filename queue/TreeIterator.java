import java.util.Iterator;


public class TreeIterator implements Iterator<Integer> {
    private Node next;
    private Queue<Node> queue;
    public TreeIterator(Node root) {
        queue = new Queue<Node>();
        next = root;
    }
    @Override
    public boolean hasNext() {
            return next!= null;
    }
    @Override
        public Integer next() {
        Integer returnValue = next.value;
        if(next.left!=null)
            queue.add(next.left);
        if(next.right!=null)
            queue.add(next.right);
        next = queue.remove();
        return returnValue;
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
