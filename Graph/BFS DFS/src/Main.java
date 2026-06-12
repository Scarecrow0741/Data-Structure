//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void BFS( Node start ){
        Queue q = new Queue();
        Visited_set v = new Visited_set();

        v.add( start ) ;
        q.enque( start );

        while( q.head != null){
            Node curr = q.deque() ;

            System.out.print( curr.data + " ");

            Adj_node nei = curr.head ;

            while( nei != null ){
                Node ok = nei.node;
                if( !v.check_if_exists(ok) ){
                    v.add(ok) ;
                    q.enque( ok );
                }
                nei = nei.next ;
            }
        }
        System.out.println();
    }

    public static void DFS( Node start ){
        Stack s = new Stack() ;
        Visited_set v = new Visited_set();

        s.push( start );

        while( s.head != null ){
            Node curr = s.pop() ;

            if (v.check_if_exists(curr)) {
                continue;
            }

            System.out.print( curr.data + " ");
            v.add( curr );

            Adj_node nei = curr.head ;

            while( nei != null ){
                Node ok = nei.node;
                if( !v.check_if_exists(ok) ){
                    s.push( ok );
                }
                nei = nei.next ;
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        //graph from book page number 125
        Node a = new Node('A');
        Node p = new Node('P');
        Node w = new Node('W');
        Node l = new Node('L');
        Node o = new Node('O');
        Node r = new Node('R');
        Node u = new Node('U');
        Node m = new Node('M');


        a.add_neighbour(p); a.add_neighbour(w);
        p.add_neighbour(a); w.add_neighbour(a);


        p.add_neighbour(l); p.add_neighbour(o);
        l.add_neighbour(p); o.add_neighbour(p);


        w.add_neighbour(r); w.add_neighbour(u);
        r.add_neighbour(w); u.add_neighbour(w);

       
        l.add_neighbour(m); m.add_neighbour(l);
        o.add_neighbour(m); m.add_neighbour(o);
        r.add_neighbour(m); m.add_neighbour(r);
        u.add_neighbour(m); m.add_neighbour(u);

        System.out.print("BFS Traversal: ");
        BFS(a);

        System.out.println();

        System.out.print("DFS Traversal: ");
        DFS(a);
    }
}