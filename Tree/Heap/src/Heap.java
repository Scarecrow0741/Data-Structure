public class Heap {
    Node root ;

    public Heap(){
        root = null ;
    }

    public void insert( int val ){

        Node new_n = new Node( val ) ;

        if( root == null ){
            root = new_n ;
            return ;
        }

        Queue q = new Queue() ;
        q.enque( root );

        while( q.head != null ){
            Node curr = q.deque();

            if( curr.lchild == null ){
                curr.lchild = new_n ;
                new_n.parent = curr ;
                break ;
            }
            else{
                q.enque( curr.lchild );
            }

            if( curr.rchild == null ){
                curr.rchild = new_n ;
                new_n.parent = curr ;
                break ;
            }
            else{
                q.enque( curr.rchild );
            }
        }

        heapify_up( new_n );
    }

    private void heapify_up( Node curr ){
        while( curr.parent != null && curr.data > curr.parent.data ){
            int temp = curr.data;
            curr.data = curr.parent.data ;
            curr.parent.data = temp ;
            curr = curr.parent ;
        }
    }

    private Node find( int val ){
        if (root == null) return null;

        Queue q = new Queue();

        q.enque( root ) ;

        while( q.head!= null ){
            Node curr = q.deque();
            if( curr.data == val ) return curr ;
            if( curr.lchild != null ) q.enque( curr.lchild );
            if( curr.rchild != null ) q.enque( curr.rchild );
        }
        return null ; // if not found
    }

    private Node find_last( ){
        if (root == null) return null;

        Queue q = new Queue();

        q.enque( root ) ;
        Node last = null ;

        while( q.head != null ){
            last = q.deque();
            if( last.lchild != null ) q.enque( last.lchild );
            if( last.rchild != null ) q.enque( last.rchild );
        }
        return last ;
    }

    private void delele_last( Node last ){
        if( last == root ){
            root = null ;
            return ;
        }

        if( last.parent.lchild == last){
            last.parent.lchild = null ;
        }
        else{
            last.parent.rchild = null ;
        }

        last.parent = null ;

    }

    public void heapify_down( Node curr ){
        while( true){
            Node largest = curr ;

            if( curr.lchild != null && largest.data < curr.lchild.data ){
                largest = curr.lchild ;
            }
            if( curr.rchild != null && largest.data < curr.rchild.data ){
                largest = curr.rchild ;
            }

            if( curr == largest ) break ;

            int temp = curr.data;
            curr.data = largest.data;
            largest.data = temp ;
            curr = largest ;

        }
    }

    public void remove(int val){

        Node target = find( val ) ;

        if( target == null ){
            System.out.println("Node doesnt exist");
            return;
        }

        Node last = find_last() ;
        delele_last( last );
        if (target == last) {
            return ;
        }
        target.data = last.data ;

        heapify_up( target );
        heapify_down( target );

    }

    public void show(){
        if (root == null) {
            System.out.println("Empty Heap");
            return;
        }
        Queue q = new Queue();
        q.enque(root);
        System.out.print("Current Max-Heap Structure: ");
        while (q.head != null) {
            Node curr = q.deque();
            System.out.print(curr.data + " ");
            if (curr.lchild != null) q.enque(curr.lchild);
            if (curr.rchild != null) q.enque(curr.rchild);
        }
        System.out.println();
    }


}
