public class Priority_Queue {
    public Que_node head;

    public void insert(Node u, Node v, int weight) {
        Que_node newNode = new Que_node(u, v, weight);

        if (head == null || head.weight > weight) {
            newNode.next = head;
            head = newNode;
        } else {
            Que_node current = head;
            while (current.next != null && current.next.weight <= weight) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public Que_node extractMin() {
        if (isEmpty()) {
            return null;
        }
        Que_node minNode = head;
        head = head.next;
        return minNode;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
