package Searching;

class Node {
    int data;
    Node left;
    Node right;

    Node (int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class TreeSearch {
    Node root;

    void insert (int key) {
        root = insertRec(root, key);
    }

    Node insertRec (Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    boolean search (Node root, int key) {
        if(root == null) {
            return false;
        }
        if(key == root.data) {
            return true;
        }
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }



    public static void main(String[] args) {
        TreeSearch tree = new TreeSearch();
        int[] values = {30, 20, 40, 10, 50};

        for (int val: values)
            tree.insert(val);

        int key = 50;
        boolean found = tree.search(tree.root, key);
        System.out.println(found ? "Found" : "Not found");

    }
}
