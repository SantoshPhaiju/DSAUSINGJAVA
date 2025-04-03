package Recursion;

public class Fibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci Series using Recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
