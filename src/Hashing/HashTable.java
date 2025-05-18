package Hashing;

import java.util.*;

class HashTable {
    private final int SIZE = 10;
    LinkedList<Integer>[] table;

    // Constructor
    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++)
            table[i] = new LinkedList<>();
    }

    // Hash Function
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert key
    public void insert(int key) {
        int index = hash(key);
        if (!table[index].contains(key))
            table[index].add(key);
    }

    // Search key
    public boolean search(int key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    // Delete key
    public void delete(int key) {
        int index = hash(key);
        table[index].remove((Integer) key);
    }

    // Display hash table
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            for (int key : table[i])
                System.out.print(key + " -> ");
            System.out.println("null");
        }
    }

    // Main method
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        int[] keys = {10, 20, 15, 7, 32, 17};

        for (int key : keys)
            ht.insert(key);

        ht.display();

        System.out.println("Search 15: " + ht.search(15));
        System.out.println("Delete 15");
        ht.delete(15);
        ht.display();
    }
}
