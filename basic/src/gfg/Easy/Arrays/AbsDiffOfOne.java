package gfg.Easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AbsDiffOfOne {
    public static void main(String[] args) {
        long[] arr = {7, 98, 56, 43, 45, 23, 12, 8};
        int k = 54;
        long[] ans = getDigitDiff1AndLessK(arr, arr.length, k);
        System.out.println(Arrays.toString(ans));
    }

    public static long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        ArrayList<Long> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < k && findDigitDiff(arr[i])) {
                l.add(arr[i]);
            }
        }
        return l.stream().mapToLong(Long::longValue).toArray();
    }

    private static boolean findDigitDiff(long num) {
                                      long[] arr = new long[2] ;
                                      int i =0;
        long diff = 0;
        boolean flag = false;
        while (num > 0 && i<2) {
            long rem = num % 10;  // 8
            arr[i] = rem;
            i++;
            num /= 10;
            if(i>0) {// 9
                diff = Math.abs(arr[i] - arr[i - 1]);
            }
            flag = diff == 1;        // if diff = 1 flag = true  else flag = false
        }

        return flag;
    }
}
