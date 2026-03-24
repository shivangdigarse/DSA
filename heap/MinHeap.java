package heap;

import java.util.ArrayList;

class MinHeap {
    private ArrayList<Integer> heap = new ArrayList<>();

    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;
        // Bubble up (ensure parent ≤ child)
        while (current > 0 && heap.get(current) < heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMin() {
        if (heap.size() == 0) throw new RuntimeException("Heap empty");
        int min = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (heap.size() > 0) {
            heap.set(0, last);
            heapify(0);
        }
        return min;
    }

    private void heapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) smallest = left;
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) smallest = right;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);

        heap.printHeap(); // [5, 20, 10, 30]

        System.out.println("Min: " + heap.extractMin()); // 5
        heap.printHeap(); // [10, 20, 30]
    }
}
