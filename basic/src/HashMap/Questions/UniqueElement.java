package Questions;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 5, 3, 2};
        System.out.println(findUnique(arr, arr.length));
    }

    static int findUnique(int[] arr, int n) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {

            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        for (var e : m.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return -1;
    }
}
