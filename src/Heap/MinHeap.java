package Heap;

import java.util.*;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Get index methods
    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    // Swap helper
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Insert element
    public void insert(int val) {
        heap.add(val);
        int i = heap.size() - 1;

        while (i > 0 && heap.get(i) < heap.get(parent(i))) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Heapify down (used in delete)
    private void heapify(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < heap.size() && heap.get(l) < heap.get(smallest))
            smallest = l;
        if (r < heap.size() && heap.get(r) < heap.get(smallest))
            smallest = r;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    // Remove root element (min)
    public int remove() {
        if (heap.isEmpty()) throw new NoSuchElementException("Heap is empty");

        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0);
        }

        return root;
    }

    // Display heap
    public void display() {
        System.out.println("Min-Heap: " + heap);
    }

    public static void main(String[] args) {
        MinHeap mh = new MinHeap();

        int[] values = {10, 5, 30, 2, 8};
        for (int val : values)
            mh.insert(val);

        mh.display(); // Output: Min-Heap: [2, 5, 30, 10, 8]
        System.out.println("Deleted root: " + mh.remove());
        mh.display(); // Output after removal
    }
}
