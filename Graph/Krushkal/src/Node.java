public class Node {
    public char data;


    public Node parent_set;

    public Node(char data) {
        this.data = data;
        this.parent_set = this; // Initially, every node is its own parent
    }
}