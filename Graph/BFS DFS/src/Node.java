public class Node {
    char data ;
    Adj_node head ; // for storing neighbour nodes

    public Node( char c ){
        this.data= c ;
        this.head = null ;
    }

    public void add_neighbour( Node n ){
        Adj_node new_n = new Adj_node( n );
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
