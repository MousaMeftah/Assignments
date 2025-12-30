public class Node {

// ------------------------------------------------------------------
// Node Class (Common for all Linked Lists)
// ------------------------------------------------------------------
    int data;
    Node next;
    Node prev; // Used for Doubly Linked List

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
