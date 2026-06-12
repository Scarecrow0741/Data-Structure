public class Tree {
    Node root ;

    public Tree(){
        this.root = null ;
    }

    public void add( int data ){
        root =   insert( root , data ) ;
    }

    private Node insert( Node curr , int data ){
        if( curr == null ){
            return new Node( data );
        }

        if( data > curr.data ){
            curr.rchild = insert( curr.rchild , data ) ;
        }
        else{
            curr.lchild = insert( curr.lchild , data ) ;
        }

        return curr ;
    }

    public void find( int data ){
        Node ok = search( root , data );
        if( ok == null ){
            System.out.println("Node doesnt exist");
        }
        else{
            System.out.println("Node found");
        }
    }

    private Node search( Node curr , int data ){
        if( curr == null ){
            return null ;
        }

        if( data > curr.data ){
            return  search(curr.rchild ,data );
        }
        else if (data < curr.data) {
            return search( curr.lchild , data );
        }
        else{
            return curr ;
        }
    }

    public void delete( int value ){
        root = remove( root , value );
    }

    private Node remove( Node curr , int data){
        if( curr == null ){
            return null ;
        }

        if( data > curr.data ){
            curr.rchild =  remove(curr.rchild ,data );
        }
        else if (data < curr.data) {
            curr.lchild =  remove(curr.lchild ,data );
        }
        else{
            if( curr.lchild == null ) return curr.rchild ;
            if( curr.rchild == null ) return curr.lchild ;


            int val = get_min_value( curr.rchild );
            curr.data = val ;
            curr.rchild = remove( curr.rchild , val );
        }

        return curr ;
    }

    public int get_min_value( Node curr ){
        if( curr.lchild == null ){
            return curr.data ;
        }
        return get_min_value(curr.lchild) ;
    }

    public void trav_inorder( ){
        in_order(root) ;
        System.out.println();
    }
     private void in_order( Node curr ){
        if( curr != null ){
            in_order( curr.lchild );
            System.out.print( curr.data + " ");
            in_order( curr.rchild );
        }
     }

    public void trav_preorder( ){
        pre_order(root) ;
        System.out.println();
    }
    private void pre_order( Node curr ){
        if( curr != null ){
            System.out.print( curr.data + " ");
            pre_order( curr.lchild );
            pre_order( curr.rchild );
        }
    }

    public void trav_postorder( ){
        post_order(root) ;
        System.out.println();
    }
    private void post_order( Node curr ){
        if( curr != null ){
            post_order( curr.lchild );
            post_order( curr.rchild );
            System.out.print( curr.data + " ");
        }
    }

}
