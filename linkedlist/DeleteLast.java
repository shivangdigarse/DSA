package linkedlist;

public class DeleteLast{
    public static Node deleteLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        Node head = LinkedList.convertArr2LL(arr);

        System.out.println("Original Linked List:");
        LinkedList.traverse(head);

        head = deleteLast(head);

        System.out.println("After deleting last element:");
        LinkedList.traverse(head);
    }

}