package queue;
import queue.Queue;

public class Ab_Queue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.display(); // queue.Queue: 10 20 30

        System.out.println("Peek: " + queue.peek()); // Peek: 10

        System.out.println("Popped: " + queue.pop()); // Popped: 10
        queue.display(); // queue.Queue: 20 30

        queue.push(40);
        queue.push(50);
        queue.display(); // queue.Queue: 20 30 40 50
    }
}