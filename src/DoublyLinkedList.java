// ------------------------------------------------------------------
// Doubly Linked List Class (For Q12, Q13, Q14)
// ------------------------------------------------------------------

public class DoublyLinkedList {


        Node head;

        public DoublyLinkedList() {
            this.head = null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.prev = temp;
            }
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Q12: حذف العناصر المكررة من قائمة مزدوجة (Remove duplicates)
        public void removeDuplicates() {
            Node curr = head;
            while (curr != null) {
                Node runner = curr.next;
                while (runner != null) {
                    if (runner.data == curr.data) {
                        Node nextNode = runner.next;
                        if (runner.next != null) runner.next.prev = runner.prev;
                        if (runner.prev != null) runner.prev.next = runner.next;
                        runner = nextNode;
                    } else {
                        runner = runner.next;
                    }
                }
                curr = curr.next;
            }
        }

        // Q13: طباعة القائمة المزدوجة بالعكس (Traverse in reverse)
        public void printReverse() {
            Node temp = head;
            if (temp == null) return;
            while (temp.next != null) temp = temp.next;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.prev;
            }
            System.out.println("null");
        }

        // Q14: البحث في قائمة مزدوجة (Search)
        public boolean searchDoubly(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) return true;
                temp = temp.next;
            }
            return false;
        }
    }
