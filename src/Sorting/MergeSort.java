package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void divide(int[] arr, int si, int ei) {
        // O(nlog n)
        if(si >= ei) {
            return;
        }
        // O(log n)
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);

    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        // O(n)
        int[] merged = new int[ei - si + 1];

        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if(arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }
        
        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }
        
        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }



    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));

    }
}
