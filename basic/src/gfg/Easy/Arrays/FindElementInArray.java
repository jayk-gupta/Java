package gfg.Easy.Arrays;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int X = 4;
        int ans = BinarySearch(ar, ar.length, X);
        System.out.println(ans);
    }

    static int search(int arr[], int N, int X) {

        for (int i = 0; i < N; i++) {
            if (arr[i] == X) return i;
        }
        return -1;

    }

    static int BinarySearch(int arr[], int N, int X) {
        int start = 0;
        int end = N - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (arr[mid] == X) return mid;
            else if (arr[mid] > X) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
                                return -1;
    }
}
