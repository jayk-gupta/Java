package Arrays.TcsNqtQues.Arrays;

import java.util.Arrays;

public class SmallestNum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3,14};
//        System.out.println( findSmallestNum(arr,arr.length));
        System.out.println(m2(arr));
    }

    //    method-1
    static int findSmallestNum(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //    method-2
    static int m2(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        return arr[0];
    }
}
