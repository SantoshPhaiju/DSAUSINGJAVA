package DSAQueue;

public class MainClass {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

        System.out.println(myQueue.isFull());
        System.out.println(myQueue.isEmpty());

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);

        System.out.println(myQueue.isFull());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

        myQueue.enqueue(7);
        System.out.println(myQueue.isFull());
        myQueue.displayQueue();
        myQueue.deleteQueue();

    }
}
