package linkedlist;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Node head = LinkedList.convertArr2LL(arr);

        System.out.println("Original Linked List:");
        LinkedList.traverse(head);

        // removing first
        Node temp = head;
        head = head.next;
        temp.next = null;

        //removing last
        temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        System.out.println("After operation");
        LinkedList.traverse(head);
    }
}
