public class Priority_queue_node {
    Node node ;
    int weight ;
    Node parent ;
    Priority_queue_node next ;

    public Priority_queue_node( Node n , Node p , int w ){
        this.node = n ;
        this.parent = p ;
        this.weight = w ;
        this.next = null ;
    }
}
