package Arrays.TcsNqtQues.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountFreqOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 12, 1, 1, 2, 6, 8, 6};
        ArrayList<Integer> ans = new ArrayList<>();
        ans = countFreq(arr,arr.length);
        System.out.println(ans);
    }

    static ArrayList<Integer> countFreq(int[] arr, int n) {
        ArrayList<Integer> l = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for (var e: map.entrySet()) {
                 l.add(e.getValue());
        }
        return l;
    }
}
