public class Queue {
    Node head ;
    Node tail ;

    public Queue(){
        this.head = null ;
        this.tail = null ;
    }

    public void enque( char c ){
        Node new_n = new Node( c );
        if ( head == null ){
            head = new_n ;
            tail = new_n ;
        }
        else{
            tail.next = new_n ;
            tail = new_n ;
        }
    }

    public char deque(){
        if( head == null ){
            System.out.println("Queue is empty");
            return '\0' ;
        }
        char ok = head.c;
        head = head.next ;

        if (head == null) {
            tail = null;
        }
        return ok ;
    }

    public char peek(){
        if( head == null ){
            System.out.println("Queue is empty");
            return '\0' ;
        }
        return head.c ;
    }

    public void show(){
        Node curr = head ;
        while( curr != null ){
            System.out.print(curr.c + " ");
            curr = curr.next ;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
