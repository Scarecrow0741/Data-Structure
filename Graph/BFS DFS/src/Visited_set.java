public class Visited_set {
    Adj_node head ;

    public Visited_set(){
        head = null ;
    }

    public boolean check_if_exists( Node n ){
        Adj_node curr = head ;
        while( curr != null ){
            if( curr.node == n ){
                return true ;
            }
            curr = curr.next ;
        }
        return false ;
    }

    public void add( Node n ){
        Adj_node new_n = new Adj_node( n ) ;
        if( !check_if_exists( n ) ){
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

}
