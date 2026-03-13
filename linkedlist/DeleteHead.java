package linkedlist;

public class DeleteHead {
    // Delete head method
    public static Node deleteHead(Node head) {
        if (head == null) return null;
        return head.next;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        Node head = LinkedList.convertArr2LL(arr);

        System.out.println("Original Linked List:");
        LinkedList.traverse(head);

        head = deleteHead(head);

        System.out.println("After deleting head:");
        LinkedList.traverse(head);
    }

}