package DSAQueue;

public class CircularQueue {
    private int[] arr;
    private int front, rear, size, maxSize;

    public CircularQueue(int maxSize) {
        arr = new int[maxSize];
        rear = -1;
        front = -1;
        size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if(isEmpty()){
            front = 0;
            }
            rear = (rear + 1) % maxSize;
            arr[rear] = val;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int val = arr[front];
            front = (front + 1) % maxSize;
            size--;
            return val;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[front];
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements: ");
            int i = front;
            do {
                System.out.println(arr[i] + " ");
                i = (i + 1) % maxSize;
            } while ( i != (rear + 1) % maxSize);
        }
    }



}
