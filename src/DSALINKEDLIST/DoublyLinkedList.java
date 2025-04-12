package DSALINKEDLIST;

public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <=> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            Node current = tail;
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
                current.prev = null;
            }
            size--;
            return current.data;
        }

    }


}
