package HashSet.Basics;

import java.util.HashSet;

public class Syntax {
    public static void main(String[] args) {
//
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);   // not add duplicate
        set.add(4);
        set.add(5);
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.size());
        set.remove(2);
        for (Integer n : set) {
            System.out.println(n);
        }

    }
}
