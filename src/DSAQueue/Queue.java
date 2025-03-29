package DSAQueue;

public class Queue {
    private int[] arr;
    private int rear, front;

    public Queue(int size) {
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
        System.out.println("Queue is successfully created with size of: " + size);
    }

    public boolean isFull() {
        return rear == arr.length - 1;  // Full when rear reaches last index
    }

    public boolean isEmpty() {
        return front == -1 || front > rear; // Empty when front crosses rear
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            arr[rear] = val;
            System.out.println(val + " is enqueued in the queue");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int result = arr[front];
            front++;
            if (front > rear) {  // Reset queue if all elements are removed
                front = -1;
                rear = -1;
            }
            return result;
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

    public void deleteQueue() {
        arr = null;
        front = -1;
        rear = -1;
        System.out.println("Queue is successfully deleted");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
