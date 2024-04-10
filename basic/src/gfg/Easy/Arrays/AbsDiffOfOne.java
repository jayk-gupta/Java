package gfg.Easy.Arrays;
//https://www.geeksforgeeks.org/problems/absolute-difference-11156/1?page=2&category=Arrays&sortBy=difficulty
import java.util.ArrayList;
import java.util.Arrays;

public class AbsDiffOfOne {
    public static void main(String[] args) {
//        long[] arr = { 43,7, 98, 56, 45, 23, 12, 8};
        long[] arr = {655,987, 87, 89, 45, 235, 465, 765, 123, 499};
        int k = 1000;
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
        long[] ans = new long[2];
        long diff = 0;
        int i = 0;
        boolean flag = false;
        while (num > 0) {
            long rem = num % 10;
            ans[i] = rem;
            num /= 10;
            if (i > 0) {
                diff = Math.abs(ans[0] - ans[1]);
                flag = diff == 1;
                if(diff != 1) return false;
                    // if diff = 1 flag = true  else flag = false
                ans[0] = ans[1];
            }
            else {
                i++;
            }
        }

        return flag;
    }
}
