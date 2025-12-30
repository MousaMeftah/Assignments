// ------------------------------------------------------------------
// Circular Linked List Class (For Q15, Q16, Q17, Q18)
// ------------------------------------------------------------------
class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("Head(" + head.data + ")");
    }

    // Q15: الإضافة في موقع محدد في قائمة دائرية (Insert at specific position - 0-based)
    public void insertAt(int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        if (pos == 0) {
            Node temp = head;
            while (temp.next != head) temp = temp.next;
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
            if (curr == head) return; // Position out of bounds
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Q16: الحذف من موقع محدد في قائمة دائرية (Delete from specific position - 0-based)
    public void deleteAt(int pos) {
        if (head == null) return;
        if (head.next == head) { // Single node
            if (pos == 0) head = null;
            return;
        }
        if (pos == 0) {
            Node temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = head.next;
            head = head.next;
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
            if (curr.next == head) return; // Position out of bounds
        }
        curr.next = curr.next.next;
    }

    // Q17: البحث في قائمة دائرية (Search)
    public boolean searchCircular(int key) {
        if (head == null) return false;
        Node temp = head;
        do {
            if (temp.data == key) return true;
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    // Q18: تقسيم قائمة دائرية إلى نصفين (Split into two halves)
    public void split() {
        if (head == null || head.next == head) return;
        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Handle odd number of nodes case
        if (fast.next.next == head) fast = fast.next;

        Node head1 = head;
        Node head2 = slow.next;

        // Break the first list and make it circular
        slow.next = head1;

        // Break the second list and make it circular
        fast.next = head2;

        System.out.print("List 1: ");
        new CircularLinkedList(head1).printList();
        System.out.print("List 2: ");
        new CircularLinkedList(head2).printList();
    }

    // Helper constructor for split demonstration
    public CircularLinkedList(Node h) {
        this.head = h;
    }
}