public class Visited_set {
    Visited_node head ;

    public boolean check_if_exists( Node n ){
        Visited_node current = head;
        while (current != null) {
            if (current.node == n ) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void add(Node node) {
        if (!check_if_exists(node)) {
            Visited_node newNode = new Visited_node(node);
            newNode.next = head;
            head = newNode;
        }
    }

}
