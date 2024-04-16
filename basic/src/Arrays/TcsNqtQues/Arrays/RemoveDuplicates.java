package Arrays.TcsNqtQues.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 1, 1, 3};
        System.out.println(Arrays.toString(arr));
        removeDuplicates2(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void removeDuplicates(int[] arr, int n) {
//        create hashset and modify array
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(arr[i]);
        }
        int j = 0;
        for (Integer num : s) {
            arr[j] = num;
            j++;
        }
        System.out.println(s);
    }

    //    Optimal solution
    static void removeDuplicates2(int[] arr, int n) {
//
        int i = 0;
        int j = 1;
        while (j<n) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
                j++;

        }

    }

}

