public class Priority_queue {
    Priority_queue_node head ;

    public void insert( Node n , Node p , int w ){
        Priority_queue_node new_n = new Priority_queue_node( n , p , w);

        if( head == null || head.weight > w ){
            new_n.next = head ;
            head = new_n ;
        }
        else{
            Priority_queue_node curr = head ;
            while( curr.next!= null && curr.next.weight <= w ){
                curr = curr.next ;
            }
            new_n.next = curr.next ;
            curr.next = new_n ;
        }
    }

    public Priority_queue_node extract_min(){
        if (is_empty()) {
            return null;
        }
        Priority_queue_node min = head ;
        head = head.next ;
        return min ;
    }

    public boolean is_empty(){
        return head == null ;
    }

}
