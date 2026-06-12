//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("Is the queue empty? " + queue.isEmpty());
        queue.deque();

        System.out.println("\n--- Enqueueing Elements: J, A, V, A ---");
        queue.enque('J');
        queue.enque('A');
        queue.enque('V');
        queue.enque('A');

        queue.show();
        System.out.println("Is the queue empty now? " + queue.isEmpty());
        System.out.println("Who is at the front? (peek): " + queue.peek());

        System.out.println("\n--- Dequeueing Elements ---");
        System.out.println("Served: " + queue.deque());
        System.out.println("Served: " + queue.deque());

        System.out.print("Remaining line: ");
        queue.show();
        System.out.println();
        System.out.println("New front of line: " + queue.peek());

        System.out.println("\n--- Emptying the Queue Completely ---");
        queue.deque();
        queue.deque();

        System.out.print("Final state: ");
        queue.show();
        System.out.println("Is the queue empty again? " + queue.isEmpty());

        System.out.println("\n--- Edge Case: Over-Dequeueing ---");
        queue.deque();
    }
}