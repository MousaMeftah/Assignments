import java.util.Arrays;

// ------------------------------------------------------------------
// Main Class for Demonstration
// ------------------------------------------------------------------
public class DataStructuresSolutions {
    public static void main(String[] args) {
        System.out.println("--- Array Operations Demonstration ---");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Q1
        int[] clonedArr = ArrayUtils.cloneArray(arr);
        System.out.println("Q1 (Clone): " + Arrays.toString(clonedArr));

        // Q4
        ArrayUtils.reverse(arr);
        System.out.println("Q4 (Reverse): " + Arrays.toString(arr));

        // Q3
        int[] arr2 = {1, 5, 2, 5, 3};
        int[] removedArr = ArrayUtils.removeElement(arr2, 5);
        System.out.println("Q3 (Remove 5): " + Arrays.toString(removedArr));

        System.out.println("\n--- Singly Linked List Demonstration ---");
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);
        System.out.print("Original List: "); list1.printList();

        // Q6/Q7
        list1.rotateRight(2);
        System.out.print("Q6/Q7 (Rotate Right by 2): "); list1.printList();

        // Q11
        list1.removeAt(0);
        System.out.print("Q11 (Remove at pos 0): "); list1.printList();

        System.out.println("\n--- Doubly Linked List Demonstration ---");
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.add(10); dList.add(20); dList.add(10); dList.add(30); dList.add(20);
        System.out.print("Original Doubly List: "); dList.printList();

        // Q13
        System.out.print("Q13 (Reverse Print): "); dList.printReverse();

        // Q12
        dList.removeDuplicates();
        System.out.print("Q12 (Remove Duplicates): "); dList.printList();

        System.out.println("\n--- Circular Linked List Demonstration ---");
        CircularLinkedList cList = new CircularLinkedList();
        cList.add(1); cList.add(2); cList.add(3); cList.add(4); cList.add(5);
        System.out.print("Original Circular List: "); cList.printList();

        // Q15
        cList.insertAt(99, 2);
        System.out.print("Q15 (Insert 99 at pos 2): "); cList.printList();

        // Q18
        System.out.println("Q18 (Split):");
        cList.split();
    }
}