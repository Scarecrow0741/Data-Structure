//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Heap maxHeap = new Heap();

        System.out.println("--- 1. Testing Orderly Insertions ---");
        maxHeap.insert(15);
        maxHeap.insert(10);
        maxHeap.insert(25);
        maxHeap.insert(5);
        maxHeap.insert(30);
        maxHeap.insert(20);


        maxHeap.show();

        System.out.println("\n--- 2. Testing Root Removal (Extract Max) ---");
        System.out.println("Removing maximum value (30)...");
        maxHeap.remove(30);
        maxHeap.show();


        System.out.println("\n--- 3. Testing Deep Internal Node Removal ---");
        System.out.println("Removing internal value 15...");
        maxHeap.remove(15);
        maxHeap.show();

        System.out.println("\n--- 4. Testing Exact Last Node Removal ---");
        System.out.println("Removing final node in tree array index (10)...");
        maxHeap.remove(10);
        maxHeap.show();

        System.out.println("\n--- 5. Clearing Out Remainder (Edge Case Verification) ---");
        System.out.println("Removing 25...");
        maxHeap.remove(25);
        System.out.println("Removing 5...");
        maxHeap.remove(5);
        System.out.println("Removing 20...");
        maxHeap.remove(20);

        maxHeap.show();
    }
}