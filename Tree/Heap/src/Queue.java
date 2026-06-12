public class Queue {
    Que_node head ;
    Que_node tail ;
    private int size = 0 ;

    public void enque( Node data ){
        Que_node new_n = new Que_node( data ) ;
        if( head == null ){
            head = new_n ;
            head.next = null ;
            tail = head ;
        }
        else{
            tail.next = new_n ;
            tail = new_n ;
            tail.next = null ;
        }
        size++ ;
    }

    public Node deque(){

        Node ok = head.n ;
        Que_node curr = head ;
        head = head.next ;
        curr.next = null ;
        size-- ;
        return ok ;
    }

    public void show_que(){
        Que_node curr = head ;
        while( head != null ){
            System.out.println( head.n );
            head = head.next ;
        }
    }

    public int show_size(){
        return size ;
    }
}
