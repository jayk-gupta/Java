package gfg.Easy.Arrays;

import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/count-odd-even/1?page=1&category=Arrays&sortBy=difficulty
public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1};
        int[] ans = countOddEven(arr,arr.length);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] countOddEven(int[] arr, int n)
    {
        int even = 0;
        int odd = 0;
        for (int j : arr) {
            if (j % 2 == 0) even++;
            else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }
}
