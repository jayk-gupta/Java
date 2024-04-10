package gfg.Easy.Arrays;

public class IshaanLovesChocolate {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 9};
        System.out.println(chocolates(arr.length, arr));
    }

    public static int chocolates(int n, int[] arr) {
        // code here
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] > arr[end]) {
                start++;
            } else {
                end--;
            }
        }
        return arr[start];
    }
}
