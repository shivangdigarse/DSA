package queue;

import java.util.LinkedList;
import java.util.Queue;
public class Ad_InBuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Element at front: "+q.peek());
        System.out.println("Deleted element: "+q.poll());
        System.out.println("Element at front: "+q.peek());
    }
}
