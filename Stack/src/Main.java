//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Is empty? " + stack.isEmpty());

        System.out.println("\n--- Pushing Elements: A, B, C, D ---");
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');

        System.out.print("Stack state (Top to Bottom): ");
        stack.show();

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("\n--- Popping Two Elements ---");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.print("Stack state after pops: ");
        stack.show();
        System.out.println("New top element (peek): " + stack.peek()); // Expected: B

        System.out.println("\n--- Clearing the Stack ---");
        stack.pop();
        stack.pop();

        System.out.print("Stack state after clearing: ");
        stack.show();

        System.out.println("\n--- Testing Underflow Edge Case ---");
        stack.pop();
    }
}