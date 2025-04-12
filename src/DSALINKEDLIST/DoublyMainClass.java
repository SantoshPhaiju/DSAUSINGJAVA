package DSALINKEDLIST;

public class DoublyMainClass {
    public static void main(String[] args) {
        DoublyLinkedList myDll = new DoublyLinkedList();
        myDll.append(10);
        myDll.append(20);
        myDll.append(30);
        myDll.append(40);

        myDll.printList();
        System.out.println(myDll.removeLast() + " is removed from the list.");
        myDll.printList();
    }
}
