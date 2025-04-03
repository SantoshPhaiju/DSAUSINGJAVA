package DSALINKEDLIST;

public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 10 -> 20 -> Null
    // 10 -> 20 -> 30 -> null
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addAt(int index, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("List is empty, adding at index 0");
            head = newNode;
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }
        Node current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void addAfter(int index, int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        int count = 0;

        // Traverse to the index-th node
        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }

        // If index is out of bounds
        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Create the new node and adjust pointers
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void deleteAt(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        int count = 0;
        Node temp = head;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        if (temp.next == null){
            System.out.println("Index out of bounds.");
            return;
        }

        temp.next = temp.next.next;
    }

    public void search(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == key) {
                System.out.println("Found " + key + " at index " + index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println(key + " doesn't exists in the list.");

    }

    public void displayLinkedList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }


}
