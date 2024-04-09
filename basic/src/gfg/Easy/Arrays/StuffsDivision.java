package gfg.Easy.Arrays;
//https://www.geeksforgeeks.org/problems/stuffs-division5735/1?page=2&category=Arrays&sortBy=difficulty
public class StuffsDivision {
    public static void main(String[] args) {
        long[] arr = {7, 4, 1, 1, 2};
        System.out.println(possible(arr, arr.length));
    }

    public static boolean possible(long arr[], long n) {

        long givenGoodies = 0;
        long correctGoodies = 0;
        for (int i = 0; i < n; i++) {
                              givenGoodies += arr[i];
                              correctGoodies += i+1;
        }
        return correctGoodies == givenGoodies;
    }
}
