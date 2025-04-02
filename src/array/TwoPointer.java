package array;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
//        int []arr = {0,1,0,3,0,12};
//        tp(arr);
        int[] arr = {1,2,2,3,4,5,6,6,7,7,8,9,9};
        tp1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void tp(int[] arr) {
        int left= 0;
        int right= 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right++;
            }else {
                right++;
            }
        }
    }

    public static void tp1(int[] arr) {
        int first = 0;
        int second = 1;

        while (second < arr.length) {
            if (arr[first] == arr[second]) {
                second++;
            }else {
                ++first;
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
                second++;
            }
        }
    }
}
