package Sorting;

import java.util.Arrays;

public class SelectionSorting {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
        int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int [] arr = {7, 8, 3, 1, 2, 4, 12, 43, 22, 6, 13};
        selectionSort(arr);
    }
}
