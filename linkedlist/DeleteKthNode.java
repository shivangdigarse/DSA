package linkedlist;

public class DeleteKthNode {

    // Delete kth element method
    public static Node deleteKthElement(Node head, int k) {
        if (head == null) return null;
        else if (k == 1) {
            return head.next;
        }
        int count = 1;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (count == k) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        return head;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        Node head = LinkedList.convertArr2LL(arr);

        System.out.println("Original Linked List:");
        LinkedList.traverse(head);

        head = deleteKthElement(head, 1);

        System.out.println("After deleting 1st element:");
        LinkedList.traverse(head);
    }
}