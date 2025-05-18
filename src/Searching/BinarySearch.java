package Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] data = {43, 24, 5, 64, 32, 33, 44 ,54, 19};
        int key = 33;
        Arrays.sort(data);

        int result = binarySearch(data, key);
        System.out.println(result != -1 ? "Found at index: " + result : "Not found");

    }
}
