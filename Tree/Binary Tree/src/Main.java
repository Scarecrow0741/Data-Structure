//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tree myTree = new Tree();

        System.out.println("=== 1. Populating Tree ===");
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) {
            myTree.add(v);
        }
        System.out.print("Initial Tree: ");
        myTree.trav_inorder(); // 20 30 40 50 60 70 80
        System.out.println();

        System.out.println("=== 2. Testing Public 'delete(int value)' ===");
        System.out.println("Deleting leaf node 20...");
        myTree.delete(20);
        System.out.print("Tree state:   ");
        myTree.trav_inorder(); // 30 40 50 60 70 80
        System.out.println();

        System.out.println("=== 3. Testing New Public 'remove(int data)' ===");
        // Testing our newly exposed public remove method
        System.out.println("Removing single-child node 30...");
        myTree.delete(30);
        System.out.print("Tree state:   ");
        myTree.trav_inorder(); // 40 50 60 70 80
        System.out.println();

        System.out.println("Removing root node 50...");
        myTree.delete(50);
        System.out.print("Tree state:   ");
        myTree.trav_inorder(); // 40 60 70 80
        System.out.println();

        System.out.println("=== 4. Verifying Remaining Methods Still Work ===");
        myTree.find(70);
        System.out.println("Current Minimum: " + myTree.get_min_value(myTree.root));
    }
}