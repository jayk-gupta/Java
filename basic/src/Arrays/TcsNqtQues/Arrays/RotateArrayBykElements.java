package Arrays.TcsNqtQues.Arrays;

import java.util.Arrays;

public class RotateArrayBykElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateArrayByLeft(arr, arr.length, k);
        System.out.println(Arrays.toString(arr));

    }

    static void rotateArray(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            for (int j = 0; j < n-1; j++) {
                arr[n - 1 - j] = arr[n - 2 - j];
            }
            arr[0] = temp;
        }
    }
//gfg ques
static void rotateArrayByLeft(int[] arr, int n, int k) {
    for (int i = 0; i < k; i++) {
        int temp = arr[0];         //0
        for (int j = 0; j < n-1; j++) {
            arr[ j] = arr[j+1];
        }
        arr[n-1] = temp;      //arr[n-1]

    }
}

}
