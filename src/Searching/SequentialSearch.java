package Searching;

public class SequentialSearch {

    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] data = {10, 25, 30, 45, 50};
        int key = 30;

        int result = sequentialSearch(data, key);
        System.out.println(result != -1 ? "Found at index: " + result : "Not found");

    }
}
