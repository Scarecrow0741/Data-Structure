public class Stack {
    Adj_node head ;

    public Stack(){
        head = null ;
    }

    public void push ( Node n ){
        Adj_node new_n = new Adj_node( n );
        if( head== null ){
            head = new_n ;
            head.next = null ;
        }
        else{
            new_n.next = head ;
            head = new_n ;
        }
    }


    public Node pop(){
        Node n = head.node ;
        head = head.next ;
        return n ;
    }
}
