import java.util.Scanner ;

public class Main {

    public static int[][] input_2D_array() {
        int r;
        int c;

        System.out.println("Input the row size:");
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();

        System.out.println("Input the column size:");
        c = scan.nextInt();

        int[][] arr2 = new int[r][c];


        System.out.println("Input the numbers:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }

        return arr2 ;
    }

    public static void sum_boundary( int[][] arr ){
        int r = arr.length;
        int c = arr[0].length;
        int sum = 0 ;

        for( int i = 0 ; i < r ; i++ ){
            for( int j = 0 ; j < c ; j++ ){
                if( i == 0 || i == r -1 || j == 0 || j == c - 1 ){
                    sum += arr[i][j] ;
                }
            }
        }

        System.out.println("Sum of boundary elements: " + sum );
        System.out.println( );

    }

    public static void sum_diagonal( int[][] arr ){
        int r = arr.length;
        int c = arr[0].length;
        int sum = 0 ;

        for( int i = 0 ; i < r ; i++ ){
            for( int j = 0 ; j < c ; j++ ){
                if( i == j || i+j == r -1 ){
                    sum += arr[i][j] ;
                }
            }
        }

        System.out.println("Sum of diagonal elements: " + sum );
        System.out.println( );

    }

    public static void average_of_best_three( int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        for( int i = 0 ; i < r ; i++ ){
            int sum = 0 ;
            int min = arr[i][0] ;
            for( int j = 0 ; j < c ; j++ ){
                sum += arr[i][j];
                if( arr[i][j] < min ){
                    min = arr[i][j] ;
                }
            }
            double sum_av = (sum - min ) / 3.0 ;
            System.out.println("average mark of "+ i + "th studnent is: " + sum_av );
        }
    }


    public static void main(String[] args) {
        int[][] arr = input_2D_array();

        sum_boundary(arr);
        sum_diagonal(arr);

        average_of_best_three(arr);
    }
}