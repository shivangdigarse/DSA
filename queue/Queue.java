package queue;

class Queue {
    int size = 10;
    int[] q = new int[size];
    int start = -1, end = -1, curr_size = 0;

    // Push element into queue
    void push(int value) {
        if (curr_size == size) {
            System.out.println("Overflow");
            return;
        }
        if (curr_size == 0) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % size;
        }
        q[end] = value;
        curr_size++;
    }

    // Pop element from queue
    int pop() {
        if (curr_size == 0) {
            System.out.println("Underflow");
            return -1;
        }
        int val = q[start];
        start = (start + 1) % size;
        curr_size--;
        if (curr_size == 0) {
            start = -1;
            end = -1;
        }
        return val;
    }

    // Peek front element
    int peek() {
        if (curr_size == 0) {
            System.out.println("queue.Queue is empty");
            return -1;
        }
        return q[start];
    }

    // Display queue contents
    void display() {
        if (curr_size == 0) {
            System.out.println("queue.Queue is empty");
            return;
        }
        System.out.print("queue.Queue: ");
        for (int i = 0; i < curr_size; i++) {
            int index = (start + i) % size;
            System.out.print(q[index] + " ");
        }
        System.out.println();
    }
}
