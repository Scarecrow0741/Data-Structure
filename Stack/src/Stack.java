public class Stack {
    Node head ;

    public Stack(){
        head = null ;
    }

    public void push( char c ){
        Node new_n = new Node( c );

        if( head == null ){
            head = new_n ;
            new_n.prev = null ;
        }
        else{
            new_n.prev = head ;
            head = new_n ;
        }
    }

    public char pop(){
        if( head == null ) {
            System.out.println("Stack is empty!");
            return '\0';
        }
        char ok = head.c ;
        head = head.prev ;
        return ok ;
    }

    public char peek() {
        if (head == null) {
            System.out.println("Stack is empty!");
            return '\0';
        }
        return head.c;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void show(){
        Node curr = head ;
        while( curr != null ){
            System.out.print(curr.c + " ");
            curr = curr.prev ;
        }
    }
}
