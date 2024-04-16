package Arrays.TcsNqtQues.Arrays;

import java.util.Arrays;

public class RotateArrayBykElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
//        rotateArrayByLeft(arr, arr.length, k);
        rotateArrayByLeft(arr,arr.length,k);
//        int[] ans = rotateArrayOptimize(arr, arr.length, k);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(ans));


    }

    //brute force solution
    static void rotateArray(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            for (int j = 0; j < n - 1; j++) {
                arr[n - 1 - j] = arr[n - 2 - j];
            }
            arr[0] = temp;
        }
    }

    //    optimized solution
    static int[] rotateArrayOptimize(int[] arr, int n, int k) {
        int[] ans = new int[n];

//        n-k = 6-2 = 4,
//        2-2 =0
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - k + 1 - i];

        }
        int j = k;
        for (int i = 0; i < n - k; i++) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    //gfg ques
    static void rotateArrayByLeft(int[] arr, int n, int k) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - k + 1 - i];

        }
        int j = k;
        for (int i = 0; i < n - k; i++) {
            ans[j] = arr[i];
            j++;
        }
        System.arraycopy(ans, 0, arr, 0, n);
    }

}
