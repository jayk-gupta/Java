package Arrays.TcsNqtQues.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        rev(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    //    method-1
    static void rev(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}
