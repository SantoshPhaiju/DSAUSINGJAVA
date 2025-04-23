package Sorting;

public class MainClass {
    public static void main(String[] args) {
        // insertion sort
        int [] arr = {3, 2, 4, 5, 6, 7, 5 ,43, 23, 45, 6, 7, 7 ,8};

        System.out.println("Before sorting:");
        for(int data : arr) {
            System.out.print(data + " ");
        }

        int temp, j;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (j = i; j > 0 && temp < arr[j-1]; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }

        System.out.println();
        System.out.println("After sorting:");
        for(int data : arr) {
            System.out.print(data + " ");
        }
    }
}
