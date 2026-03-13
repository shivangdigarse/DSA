package linkedlist;

public class DLL {

    // Convert array to doubly linked list
    public static Dnode convertArr2DLL(int[] arr) {
        Dnode head = new Dnode(arr[0]);
        Dnode mover = head;
        for (int i = 1; i < arr.length; i++) {
            Dnode temp = new Dnode(arr[i]);
            temp.back = mover;
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Traverse doubly linked list
    public static void traverse(Dnode head) {
        Dnode temp = head;
        System.out.print("null <--> ");
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}