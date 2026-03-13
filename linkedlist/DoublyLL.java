package linkedlist;

public class DoublyLL {

    // Delete head
    public static Dnode deleteHead(Dnode head) {
        if (head == null || head.next == null) return null;
        head = head.next;
        head.back.next = null;
        head.back = null;
        return head;
    }

    // Delete tail
    public static Dnode deleteTail(Dnode head) {
        if (head.next == null) return null;
        Dnode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.back.next = null;
        temp.back = null;
        return head;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        Dnode head = DLL.convertArr2DLL(arr);

        System.out.println("Original Doubly Linked List:");
        DLL.traverse(head);

        head = deleteHead(head);
        System.out.println("After deleting head:");
        DLL.traverse(head);

        head = deleteTail(head);
        System.out.println("After deleting tail:");
        DLL.traverse(head);
    }
}