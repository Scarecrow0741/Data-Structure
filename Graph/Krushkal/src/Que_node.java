public class Que_node {
    public Node u;
    public Node v;
    public int weight;
    public Que_node next;

    public Que_node(Node u, Node v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
        this.next = null;
    }
}
