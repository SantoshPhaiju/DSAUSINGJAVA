package DSALINKEDLIST;

public class MainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.addFirst(11);
//        list.addFirst(12);

//        list.addLast(13);
//        list.addLast(14);
//        list.addLast(15);
//
//        list.print();
//
//        list.deleteLast();
//        list.deleteFirst();
//        list.print();

        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.addFirst(10);
//        sll.addFirst(20);
//        sll.addFirst(30);
        sll.addLast(10);
        sll.addLast(20);
        sll.addLast(30);
        sll.addLast(40);
        sll.addAt(3, 70);
        sll.addAt(0, 1);
        sll.addAfter(2, 25);
        sll.addAfter(10, 100);
        sll.deleteFirst();
        sll.deleteLast();
        sll.deleteAt(2);
        sll.deleteAt(20);
        sll.deleteAt(4);
        sll.deleteAt(3);
        sll.search(50);
        sll.displayLinkedList();
    }
}
