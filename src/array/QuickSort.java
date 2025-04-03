package array;

import java.util.Arrays;

public class QuickSort{
    public static void main(String [] args) {
        int []arr = {-11,10,9,5,22,-110,83,23};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void qs(int []arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s+(e-s)/2;

        int pivot = arr[mid];

        while (s<e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }
        qs(arr, low, s-1);
        qs(arr, s+1, high);
    }
}