public class SinglyLinkedList {


// ------------------------------------------------------------------
// Singly Linked List Class (For Q5, Q6, Q7, Q8, Q9, Q10, Q11)
// ------------------------------------------------------------------



        Node head;

        public SinglyLinkedList() {
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
            }
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Q5: دمج قائمتين مرتبتين (Concatenate two linked lists)
        public void concatenate(SinglyLinkedList list2) {
            if (this.head == null) {
                this.head = list2.head;
            } else {
                Node temp = this.head;
                while (temp.next != null) temp = temp.next;
                temp.next = list2.head;
            }
        }

        // Q6 & Q7: تدوير القائمة المرتبطة لليمين بمقدار k (Rotate linked list)
        public void rotateRight(int k) {
            if (head == null || k == 0) return;
            Node curr = head;
            int len = 1;
            while (curr.next != null) {
                curr = curr.next;
                len++;
            }
            curr.next = head; // Make it circular temporarily
            k = k % len;
            for (int i = 0; i < len - k; i++) curr = curr.next;
            head = curr.next;
            curr.next = null; // Break the circle
        }

        // Q8: البحث عن عنصر وإرجاع موقعه (Search and return position - 1-based)
        public int search(int key) {
            Node temp = head;
            int pos = 1;
            while (temp != null) {
                if (temp.data == key) return pos;
                temp = temp.next;
                pos++;
            }
            return -1;
        }

        // Q9 & Q10: إيجاد فهرس قيمة معينة (Find index of data value - 0-based)
        public int findIndex(int value) {
            Node temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.data == value) return index;
                temp = temp.next;
                index++;
            }
            return -1; // Not found
        }

        // Q11: الحذف من موقع محدد (Remove at specific position - 0-based)
        public void removeAt(int pos) {
            if (head == null) return;
            if (pos == 0) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 0; temp != null && i < pos - 1; i++) temp = temp.next;
            if (temp == null || temp.next == null) return;
            temp.next = temp.next.next;
        }
    }

