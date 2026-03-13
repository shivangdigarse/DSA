package linkedlist;

import java.util.Scanner;

public class SearchInLL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a target: ");
        int target = input.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node head = LinkedList.convertArr2LL(arr);

        System.out.println("Is target present? " + LinkedList.search(head, target));

        input.close();
    }
}