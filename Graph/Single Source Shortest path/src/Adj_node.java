public class Adj_node {
    public Node node;
    public int weight;
    public Adj_node next;

    public Adj_node(Node node, int weight) {
        this.node = node;
        this.weight = weight;
        this.next = null;
    }
}
