package DSAQueue;

public class MainClass {
    public static void main(String[] args) {
//        Queue myQueue = new Queue(5);
//
//        System.out.println(myQueue.isFull());
//        System.out.println(myQueue.isEmpty());
//
//        myQueue.enqueue(1);
//        myQueue.enqueue(2);
//        myQueue.enqueue(3);
//        myQueue.enqueue(4);
//        myQueue.enqueue(5);
//        myQueue.enqueue(6);
//
//        System.out.println(myQueue.isFull());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        myQueue.displayQueue();
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//
//
//        myQueue.displayQueue();
//
//        myQueue.enqueue(7);
//        System.out.println(myQueue.isFull());
//        myQueue.displayQueue();
//        myQueue.deleteQueue();



        // Circular Queue
        CircularQueue myCircularQueue = new CircularQueue(5);
        myCircularQueue.enqueue(1);
        myCircularQueue.enqueue(2);
        myCircularQueue.enqueue(3);
        myCircularQueue.enqueue(4);
        myCircularQueue.enqueue(5);
//        myCircularQueue.enqueue(6);

        System.out.println(myCircularQueue.isFull());
        myCircularQueue.printQueue();

        System.out.println("DeQueuing elements from front");
        System.out.println(myCircularQueue.dequeue());
        System.out.println(myCircularQueue.dequeue());
        System.out.println(myCircularQueue.dequeue());

        myCircularQueue.printQueue();
        myCircularQueue.enqueue(7);
        myCircularQueue.printQueue();

    }
}
