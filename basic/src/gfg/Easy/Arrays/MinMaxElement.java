package gfg.Easy.Arrays;
//https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?page=2&category=Arrays&sortBy=difficulty
public class MinMaxElement {
    public static void main(String[] args) {
        long[] arr = {12, 15, 51, 100, 4, 1, 20};
       Pair ans =  getMinMax(arr,arr.length);
        System.out.println(ans.first);
        System.out.println(ans.second);

    }

    static Pair getMinMax(long a[], long n) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
             if(a[i] > max ) max = a[i];
             if(a[i] < min) min = a[i];
        }
        return new Pair(min, max);
    }


    static class Pair {
        long first, second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

}
