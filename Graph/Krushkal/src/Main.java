//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Node find(Node node) {
        if (node.parent_set == node) {
            return node;
        }
        return node.parent_set = find(node.parent_set);
    }

    public static void union(Node node1, Node node2) {
        node2.parent_set = node1;
    }

    public static void kruskalMST(Priority_Queue edges, int nodeCount) {
        int edge_count = 0;

        System.out.println("Edge \tWeight");


        while (!edges.isEmpty() && edge_count < nodeCount - 1) {
            Que_node edge = edges.extractMin();

            Node root_U = find(edge.u);
            Node root_V = find(edge.v);


            if (root_U != root_V) {
                System.out.println(edge.u.data + " - " + edge.v.data + "\t" + edge.weight);
                union(root_U, root_V);
                edge_count++;
            }
        }

    }
    public static void main(String[] args) {
        Node v1 = new Node('1');
        Node v2 = new Node('2');
        Node v3 = new Node('3');
        Node v4 = new Node('4');
        Node v5 = new Node('5');
        Node v6 = new Node('6');
        Node v7 = new Node('7');
        Node v8 = new Node('8');

        Priority_Queue edges = new Priority_Queue();

        // 2. Populate edges from the graph image
        // Note: v2 - v5 connection is ignored as per your instruction

        // Weight 2 edges
        edges.insert(v1, v5, 2);
        edges.insert(v4, v7, 2);
        edges.insert(v3, v6, 2);

        // Weight 3 edges
        edges.insert(v1, v2, 3);
        edges.insert(v4, v5, 3);

        // Weight 4 edges
        edges.insert(v7, v8, 4);

        // Weight 5 edges
        edges.insert(v1, v4, 5);
        edges.insert(v5, v7, 5);
        edges.insert(v5, v8, 5);

        // Weight 6 edges
        edges.insert(v8, v6, 6);

        // Weight 7 edges
        edges.insert(v2, v3, 7);
        edges.insert(v5, v6, 7);

        // Weight 10 edges
        edges.insert(v5, v3, 10);

        System.out.println("Kruskal's Algorithm MST using pointers (Nodes 1-8):");

        // 3. Run the algorithm (8 nodes total)
        kruskalMST(edges, 8);
    }
}