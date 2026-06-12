public class Queue {
    Adj_node head ;
    Adj_node tail ;

    public Queue(){
        head = null ;
        tail = null ;
    }

    public void enque( Node n ){
        Adj_node new_n = new Adj_node( n );
        if( head == null ){
            head = new_n ;
            tail = new_n ;
            tail.next = null ;
        }
        else{
            tail.next = new_n ;
            tail = new_n ;
        }
    }

    public Node deque(){
        Node ok = head.node;
        head = head.next ;
        return ok ;
    }
}
