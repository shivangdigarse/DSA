package linkedlist;

public class LinkedList {

    // Convert array to linked list
    public static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Traverse linked list
    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Search for a target in linked list
    public static boolean search(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) return true;
            temp = temp.next;
        }
        return false;
    }

}