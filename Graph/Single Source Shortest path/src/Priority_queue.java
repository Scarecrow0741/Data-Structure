public class Priority_queue{
    PQ_node head;


    public void insert(Node node, int dist) {
        PQ_node newNode = new PQ_node(node, dist);
        if (head == null || head.dist > dist) {
            newNode.next = head;
            head = newNode;
        } else {
            PQ_node curr = head;
            while (curr.next != null && curr.next.dist <= dist) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public Node extract_min() {
        if (head == null) return null;
        Node n = head.node;
        head = head.next;
        return n;
    }

    public boolean is_empty() { return head == null; }
}
