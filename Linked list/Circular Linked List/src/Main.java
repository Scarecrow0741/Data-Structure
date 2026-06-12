//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List cl = new List();

        cl.insert_back(10);
        cl.insert_back(20);
        cl.insert_front(5);
        cl.insert_back(30);

        cl.display();

        System.out.println("\nDeleting 5 (head)");
        cl.delete_val(5);
        cl.display();

        System.out.println("\nDeleting 30 (tail)");
        cl.delete_val(30);
        cl.display();
    }
}