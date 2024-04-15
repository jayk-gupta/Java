package gfg.Medium.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingElementsInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 7, 9};
        int[] arr2 = {0, 1, 2, 1, 1, 4};
        ArrayList<Integer> l = new ArrayList<>();
        l = countEleLessThanOrEqual2(arr1, arr2, arr1.length, arr2.length);
        System.out.println(l);

    }

    //    method-1: time complexity O(N^2)
    public static ArrayList<Integer> countEleLessThanOrEqual(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] >= arr2[j]) {
                    count++;
                }
            }
            list.add(count);
            count = 0;
        }
        return list;
    }


    public static ArrayList<Integer> countEleLessThanOrEqual2(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(arr1[i], 0);
        }
        for (int i = 0; i < m; i++) {
            if (arr2[i] <= arr1[i]) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
        }
        System.out.println(map.values());
        list.addAll(map.values());
        return list;
    }

}

