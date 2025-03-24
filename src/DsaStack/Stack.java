package DsaStack;

public class Stack {
    private final int[] stack = new int[10];
    private int top = 0;

    private boolean isEmptyInternal() {
        return top == 0;
    }

    private boolean isFullInternal() {
        int stackSize = 10;
        return top == stackSize;
    }

    public void isEmpty() {
        System.out.println(isEmptyInternal());
    }

    public void isFull() {
        System.out.println(isFullInternal());
    }

    public void push(int data) {
        if(isFullInternal()) {
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }

    public void displayStack() {
        if (isEmptyInternal()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i < top; i++) {
                System.out.println(stack[i] + ", ");
            }
        }
    }

    public void pop() {
        if (isEmptyInternal()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("This element is popped: " + stack[--top]);
        }
    }

    public void peek() {
        if (isEmptyInternal()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Peeked element is: " + stack[top - 1]);
        }
    }


}
