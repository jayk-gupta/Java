package gfg.Easy.Arrays;
//https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1?page=2&category=Arrays&sortBy=difficulty
import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestAndSecondSmallestNum {
    public static void main(String[] args) {
        long[] arr = {2, 4, 3, 5, 6, 11};
        long[] ans = minAnd2ndMin(arr, arr.length);
        System.out.println(Arrays.toString(ans));
    }

    public static long[] minAnd2ndMin(long a[], long n) {
        long min = Long.MAX_VALUE;
        long[] ans = {0, 0};
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        ans[0] = min;
        min= Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (min > a[i] && a[i] != ans[0]) {
                min = a[i];
                ans[1] = a[i];
            }
        }


        return new long[]{ans[0], ans[1]};
    }
}
