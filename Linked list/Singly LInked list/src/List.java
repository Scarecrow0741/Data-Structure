public class List {
    Node head ;
    Node tail ;

    public List(){
        head = null ;
        tail = null ;
    }

    public void input( String s ){ // for inserting many inputs at a time
        int pos = 0 ;

        for( int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i) ;
            if( c == ' '){
                String sub = s.substring( pos , i ).trim() ;
                if (!sub.isEmpty()) {
                    int val = Integer.parseInt(sub);
                    insert_back(val);
                }
                pos = i+1 ;
            }
        }

        String last = s.substring( pos ).trim() ;
        if (!last.isEmpty()) {
            int val = Integer.parseInt(last);
            insert_back(val);
        }

    }

    public void insert_front( int val ){
        Node new_n = new Node( val );
        new_n.next = head ;
        head = new_n ;

        if( tail == null ){
            tail = new_n ;
        }
    }

    public void insert_back( int val ){
        Node new_n = new Node( val );
        if ( head == null ){
            head = new_n ;
            tail = new_n ;
            tail.next = null ;
        }
        else{
            tail.next = new_n ;
            tail = new_n ;
        }
    }

    public void insert_after( int after , int val ){
        Node new_n = new Node( val );

        Node curr = head ;
        while( curr != null ){
            if( curr.value == after ){
                new_n.next = curr.next ;
                curr.next = new_n ;
                if (curr == tail) {
                    tail = new_n;
                }
                break ;
            }
            curr = curr.next;
        }
    }

    public void delete_val( int val ){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if( head.value == val ){
            head = head.next ;
        }
        else{
            Node curr = head ;
            while( curr.next != null ) {
                if (curr.next.value == val) {
                    if (curr.next == tail) {
                        tail = curr;
                    }
                    curr.next = curr.next.next;
                    break;
                }
                curr = curr.next;
            }
        }
    }

    public void delete_pos( int pos ) {
        if (head == null || pos < 1) {
            System.out.println("Invalid operation or empty list.");
            return;
        }

        int i = 0;

        if (pos == 1) {
            head = head.next;
        }
        else {
            Node curr = head;

            while (curr.next != null) {
                if (i == pos - 2) {
                    if (curr.next == tail) {
                        tail = curr;
                    }
                    curr.next = curr.next.next;
                    break;
                }
                i++;
                curr = curr.next;
            }

        }
    }

    public void find_val( int val ){
        Node curr = head ;
        int i = 1 ;

        while( curr != null ){
            if( curr.value == val ){
                System.out.println("Found at " + i +"th position");
                return ;
            }
            i++ ;
            curr = curr.next ;
        }

        System.out.println("value doesnt exist");
    }

    public void find_pos( int pos ){
        int i = 1 ;
        Node curr = head ;

        while( curr != null ){
            if( i == pos ){
                System.out.println( curr.value );
                return ;
            }
            i++ ;
            curr = curr.next ;
        }
    }

    public void show_list() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value+" ");
            curr = curr.next;
        }
        System.out.println();
    }

}
