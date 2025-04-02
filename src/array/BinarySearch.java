package array;

public class BinarySearch {
    public static void main(String [] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        int result = bs(arr,target);
        System.out.println(result);
    }

    public static int bs(int[] arr,  int target) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
            int mid = left +(right-left)/2;

            if (arr[mid] < target) {
                left = mid+1;
            } else if (arr[mid] > target) {
                right = mid-1;
            }else {
                return mid;
            }
        }
        return left;
    }
}
