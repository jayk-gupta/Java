package Arrays.TcsNqtQues.Arrays;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 8, 7, 1};
        System.out.println(findMedian(arr, arr.length));
    }

    static int findMedian(int[] arr, int n) {
        int median = Integer.MIN_VALUE;
//        median
//        odd: ((n+1)/2)
//        even: (n/2+(n/2)+1)
        Arrays.sort(arr);
        if (n % 2 == 0) {
            median = (arr[(n / 2)] + arr[((n / 2) - 1)]);
        } else {
            median = arr[((n + 1) / 2)-1];
        }
        return median;
    }
}
