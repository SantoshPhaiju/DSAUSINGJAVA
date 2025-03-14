package DSALINKEDLIST;

public class MainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.addFirst(11);
//        list.addFirst(12);

        list.addLast(13);
        list.addLast(14);
        list.addLast(15);

        list.print();

        list.deleteLast();
        list.deleteFirst();
        list.print();
    }
}
