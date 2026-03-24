package linkedlist;

public class CircularLL {
    public static void traverseCLL(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Node head = LinkedList.convertArr2LL(arr);


        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node tail = temp;

        //joining head and tail
        tail.next = head;

        //inserting into circular LL
        Node newNode = new Node(10);
        tail.next = newNode;
        tail = tail.next;
        tail.next = head;

        //traverse
        traverseCLL(head);

        //delete first and last

        //delete first
        temp = head;
        if(head != null){
            head = head.next;
            temp.next = null;
            tail.next = head;
        }

        //delete last
        temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail.next = null;
        tail = temp;
        tail.next = head;

        //traverse
        traverseCLL(head);
    }
}
