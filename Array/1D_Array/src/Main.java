import java.util.Scanner ;

public class Main {

    public static int[] input_1D_array(){
        int s ;

        System.out.print("Input the array size:");
        System.out.println();
        Scanner scan = new Scanner(System.in) ;
        s = scan.nextInt();

        int[] arr = new int[s] ;


        System.out.println("Input the numbers:");
        for( int i = 0 ; i < s ; i++ ){
            arr[i] = scan.nextInt();
        }

        return arr ;
    }

    public static void largest_element( int[] arr ){
        int lar = arr[0] ;

        for( int i = 1 ; i < arr.length ; i++ ){
            if( arr[i] > lar ){
                lar = arr[i];
            }
        }

        System.out.println("Largest element:" + lar ) ;
        System.out.println();
    }

    public static void find( int val , int[] arr ){
        for ( int i = 0 ; i < arr.length ; i++ ){
            if( arr[i] == val ){
                System.out.println("found at: "  + (i+1) );
                System.out.println();
                return;
            }
        }

        System.out.println("Not found");
        System.out.println();
    }

    public static void sum_of_odd_even( int[] arr ){
        int sum_odd = 0 ;
        int sum_even = 0 ;
        for ( int i = 0 ; i < arr.length ; i++ ){
           if( arr[i] % 2 == 0 ){
               sum_even += arr[i];
           }
           else {
               sum_odd += arr[i] ;
           }
        }
        System.out.println("sum odd: " + sum_odd );
        System.out.println("sum even: " + sum_even );
        System.out.println();
    }

    public static void insert_pos( int[] arr , int pos , int val ){ //assuming the array has enough space to insert a new element
        for ( int i = arr.length-2  ;  i >= pos - 1  ; i-- ){
            arr[i+1] = arr[i];
        }

        arr[ pos -1 ] = val ;

        System.out.println("Array after insertion:");
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.print( arr[i] + " ");
        }

        System.out.println();
    }

    public static void delete_pos( int[] arr , int pos ){
        for ( int i = pos - 1  ; i < arr.length -1  ; i++ ){
            arr[i] = arr[i+1];
        }

        System.out.println("Array after deletion:");
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.print( arr[i] + " ");
        }


        System.out.println();
    }

    public static void merge_sorted( int[] A , int a , int[] B , int b ){
        // assuming A and B are both sorted arrays AND a and b are the number of valid elements in that array . Array A has enough space as well
        int pos_a = a - 1 ;
        int pos_b = b - 1 ;
        int sum_pos = a + b - 1 ;

        while( pos_a >= 0 && pos_b >= 0 ){
            if( A[pos_a] > B[pos_b] ){
                A[sum_pos] = A[pos_a];
                --pos_a ;
            }
            else{
                A[sum_pos] = B[pos_b];
                --pos_b ;
            }
            --sum_pos ;
        }

        while( pos_b >= 0 ){ //if some elements of B are still left
            A[sum_pos] = B[pos_b];
            --pos_b ;
            --sum_pos ;
        }

        System.out.println("Merged sorted array A:");
        for( int i = 0 ; i < a+b ; i++ ){
            System.out.print( A[i] + " " );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = input_1D_array();

        largest_element(array);
        sum_of_odd_even(array);
        find(5, array);


        int[] extra_space_array = {10, 20, 30, 40, 0};
        insert_pos(extra_space_array, 3, 99);
        delete_pos(extra_space_array, 3);

        int[] array_A = {1, 3, 7, 0, 0, 0};
        int[] array_B = {2, 4, 8};
        merge_sorted(array_A, 3, array_B, 3);

    }
}