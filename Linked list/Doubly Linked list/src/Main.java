import java.util.Scanner;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter numbers separated by spaces:"); // sample input 10 20 30 40
        String s = scan.nextLine() ;

        List list = new List() ;

        list.input(s);
        list.show_list();

        list.find_pos(2);
        list.find_val(30);

        list.insert_front(5);
        System.out.print("List after inserting at the front:");
        list.show_list();

        list.insert_after(20, 99);
        System.out.print("List after inserting after 20:");
        list.show_list();

        list.delete_val(99);
        System.out.print("List after deleting 99:");
        list.show_list();

        list.delete_pos(3);
        System.out.print("List after deleting position 3:");
        list.show_list();
    }
}