package linkedlist;

public class LL2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        Node head = LinkedList.convertArr2LL(arr);

        // Print the head node’s data
        System.out.println("Head node data: " + head.data);
    }
}