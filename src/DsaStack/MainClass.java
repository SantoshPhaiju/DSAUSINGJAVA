package DsaStack;

public class MainClass {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.displayStack();
        stack.pop();
        stack.displayStack();
        stack.peek();
        stack.isEmpty();
        stack.isFull();
    }
}
