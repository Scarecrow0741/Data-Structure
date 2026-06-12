public class List {
    Node head;
    Node tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    // --- INSERTION METHODS ---

    public void insert_front(int val) {
        Node new_n = new Node(val);

        if (head == null) {
            head = new_n;
            tail = new_n;
            new_n.next = head;
        } else {
            new_n.next = head;
            head = new_n;
            tail.next = head;
        }
    }

    public void insert_back(int val) {
        Node new_n = new Node(val);

        if (head == null) {
            head = new_n;
            tail = new_n;
            new_n.next = head;
        } else {
            tail.next = new_n;
            tail = new_n;
            tail.next = head;
        }
    }


    public void delete_val(int val) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.value == val) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            if (curr.next.value == val) {
                if (curr.next == tail) {
                    tail = curr;
                }
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }

        System.out.println("Value " + val + " not found.");
    }


    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node curr = head;
        System.out.print("Circular List: ");

        do {
            System.out.print(curr.value + " ");
            curr = curr.next;
        } while (curr != head);

        System.out.println("(back to head)");
    }
}