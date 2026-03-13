package linkedlist;

public class Traversing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node head = LinkedList.convertArr2LL(arr);

        System.out.println("Traversing the Linked List:");
        LinkedList.traverse(head);
    }
}