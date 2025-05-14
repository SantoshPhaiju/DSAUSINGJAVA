package Tree;

public class BinaryTreeClass {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        public static Node buildTree(int[] nodes) {

        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 3, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
    }
}
 