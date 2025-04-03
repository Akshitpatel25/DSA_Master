package array;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        float res = sw(arr,k);
        System.out.println(res);
    }

    public static float sw(int[] arr, int k) {
        float sum = 0;
        int z = 0;
        int kk = k;

        for (int i=k; i<arr.length; i++) {

                float res = 0;
                for (int j=z; j<k; j++) {
                    res += arr[j];
                }
                if (res > sum) {
                    sum = res/kk;
                }
                z++;
                k++;


        }
        return sum;
    }
}
