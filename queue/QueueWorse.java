public class QueueWorse {
    Node head;

    private class Node {
        Integer item;
        Node next;

        private Node(Integer item, Node list) {

            this.item = item;
            this.next = list;
        }
    }

    public QueueWorse() {
        this.head = null;
    }

    public void add(Integer item) {
        if (this.head == null)
            this.head = new Node(item, null);

        else
            this.head = new Node(item, head);

    }

    public Integer remove() {
        Node curr = head;
        if (curr == null)
            return null;
        while (curr.next != null)
            curr = curr.next;
        Integer curritem = curr.item;
        curr = null;
        return curritem;
    }
}