package gfg.Easy.Arrays;

import java.util.ArrayList;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 3};
        int x = 3;
        ArrayList<Integer> l = new ArrayList<>();
        l = firstAndLast(arr, arr.length, x);
        System.out.println(l);
    }

    public static ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[start] == x) {
                list.add(arr[i]);
            } else {
                start++;
            }
            if (arr[end] == x) {
                list.add(arr[i]);
            } else {
                end--;
            }

        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }
}
