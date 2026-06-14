public class Node {
        public char data;
        public Adj_node head;
        public int distance; // Shortest distance from source
        public Node predecessor; // To reconstruct the path later

        public Node(char c) {
            this.data = c;
            this.distance = Integer.MAX_VALUE;
            this.predecessor = null;
        }

        public void add_neighbor(Node node, int weight) {
            Adj_node new_n = new Adj_node(node, weight);
            if (head == null) {
                head = new_n;
            } else {
                Adj_node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new_n;
            }
        }
}

