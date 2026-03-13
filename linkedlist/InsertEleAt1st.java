package linkedlist;

public class InsertEleAt1st {

    // Insert element at head
    public static Node insertHeadEle(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Node head = LinkedList.convertArr2LL(arr);

        System.out.println("Original Linked List:");
        LinkedList.traverse(head);

        head = insertHeadEle(head, 0);

        System.out.println("After inserting element at head:");
        LinkedList.traverse(head);
    }
}