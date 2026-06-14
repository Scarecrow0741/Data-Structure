//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void dijkstra(Node source) {
        source.distance = 0;
        Priority_queue pq = new Priority_queue();
        pq.insert(source, 0);

        while (!pq.is_empty()) {
            Node u = pq.extract_min();


            Adj_node neighbor = u.head;
            while (neighbor != null) {
                Node v = neighbor.node;
                int weight = neighbor.weight;


                if (u.distance != Integer.MAX_VALUE && u.distance + weight < v.distance) {
                    v.distance = u.distance + weight;
                    v.predecessor = u;
                    pq.insert(v, v.distance);
                }
                neighbor = neighbor.next;
            }
        }
    }

    public static void print_all_paths(Node source, Node[] allNodes) {
        System.out.println("Shortest Paths from Node " + source.data + ":");

        System.out.printf("%-8s %-12s %s\n", "Target", "Distance", "Path");
        System.out.println("----------------------------------------------");

        for (Node target : allNodes) {
            if (target.distance == Integer.MAX_VALUE) {
                System.out.printf("%-8s %-12s %s\n", target.data, "Unreachable", "None");
            } else {

                System.out.printf("%-8s %-12d ", target.data, target.distance);
                
                print_path_recursive(target);
                System.out.println();
            }
        }
    }

    private static void print_path_recursive(Node node) {
        if (node == null) return;

        if (node.predecessor != null) {
            print_path_recursive(node.predecessor);
            System.out.print(" -> ");
        }
        System.out.print(node.data);
    }

    public static void main(String[] args) {
        //graph from book page number 137
        Node n1 = new Node('1');
        Node n2 = new Node('2');
        Node n3 = new Node('3');
        Node n4 = new Node('4');
        Node n5 = new Node('5');
        Node n6 = new Node('6');
        Node n7 = new Node('7');
        Node n8 = new Node('8');


        n2.add_neighbor(n1, 300);

        n3.add_neighbor(n2, 800);
        n3.add_neighbor(n1, 1000);

        n4.add_neighbor(n3, 1200);

        n5.add_neighbor(n4, 1500);
        n5.add_neighbor(n6, 250);

        n6.add_neighbor(n4, 1000);
        n6.add_neighbor(n8, 1400);
        n6.add_neighbor(n7, 900);

        n7.add_neighbor(n8, 1000);

        n8.add_neighbor(n1, 1700);


        Node[] allNodes = {n1, n2, n3, n4, n5, n6, n7, n8};


        Node source = n5;


        dijkstra(source);


        print_all_paths(source, allNodes);
    }
}