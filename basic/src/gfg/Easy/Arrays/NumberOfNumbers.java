package gfg.Easy.Arrays;

//https://www.geeksforgeeks.org/problems/find-number-of-numbers/1?page=2&category=Arrays&sortBy=difficulty
public class NumberOfNumbers {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15};
        int k = 1;
        System.out.println(num(arr, arr.length, k));
    }

    public static int num(int a[], int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = a[i];
            while (num > 0) {
                int rem = num % 10;
                num /= 10;
                if (rem == k) {
                    count++;
                }
            }
        }
        return count;
    }

}
