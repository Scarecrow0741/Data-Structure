//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void PRIM( Node start ){
        Visited_set v = new Visited_set();
        Priority_queue p = new Priority_queue() ;

        v.add( start );

        Adj_node neighbour = start.head ;
        while( neighbour!= null ){
            p.insert( neighbour.node , start , neighbour.weight);
            neighbour = neighbour.next ;
        }

        System.out.println("Edge \tWeight");

        while(!p.is_empty()){
            Priority_queue_node curr = p.extract_min() ;
            Node curr_node = curr.node ;
            Node parent = curr.parent;
            int wei = curr.weight;

            if( v.check_if_exists(curr_node) ){
                continue ;
            }

            v.add( curr_node);
            System.out.println(parent.data + " - " + curr_node.data + "\t" + wei);

            Adj_node nei =curr_node.head ;
            while( nei!= null ){
                if(!v.check_if_exists( nei.node)) {
                    p.insert(nei.node, curr_node, nei.weight);
                }
                nei = nei.next ;
            }
        }
    }

    public static void main(String[] args) {
        // example from page num 132 of book
        Node v1 = new Node('1');
        Node v2 = new Node('2');
        Node v3 = new Node('3');
        Node v4 = new Node('4');
        Node v5 = new Node('5');
        Node v6 = new Node('6');
        Node v7 = new Node('7');
        Node v8 = new Node('8');




        v1.add_neighbour(v2, 3); v2.add_neighbour(v1, 3);
        v2.add_neighbour(v3, 7); v3.add_neighbour(v2, 7);


        v1.add_neighbour(v4, 5); v4.add_neighbour(v1, 5);
        v4.add_neighbour(v7, 2); v7.add_neighbour(v4, 2);


        v7.add_neighbour(v8, 4); v8.add_neighbour(v7, 4);


        v8.add_neighbour(v6, 6); v6.add_neighbour(v8, 6);
        v3.add_neighbour(v6, 2); v6.add_neighbour(v3, 2);


        v1.add_neighbour(v5, 2);  v5.add_neighbour(v1, 2);
        v3.add_neighbour(v5, 10); v5.add_neighbour(v3, 10);
        v4.add_neighbour(v5, 3);  v5.add_neighbour(v4, 3);
        v6.add_neighbour(v5, 7);  v5.add_neighbour(v6, 7);
        v7.add_neighbour(v5, 5);  v5.add_neighbour(v7, 5);
        v8.add_neighbour(v5, 5);  v5.add_neighbour(v8, 5);



        System.out.println("--- Prim's MST Execution ---");
        PRIM(v1);

    }
}