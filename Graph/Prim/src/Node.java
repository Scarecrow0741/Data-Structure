public class Node {
    char data ;
    Adj_node head ;

    public Node( char c ){
        this.data = c ;
        this.head = null ;
    }

    public void add_neighbour( Node n , int w ){
        Adj_node new_n = new Adj_node( n , w );

        if( head == null ){
            head = new_n ;
        }
        else{
            Adj_node curr = head ;
            while( curr.next != null ){
                curr = curr.next ;
            }
            curr.next = new_n ;
        }
    }
}
