package Arrays.Syntax.ArrayList;

import java.util.ArrayList;

public class Syntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.set(0,21);
        list.remove(2);
        System.out.println(list.contains(5));
        System.out.println(list);

        for (int i = 3; i <= 10 ; i++) {
          list.add(i);
        }  for (int i = 0; i <= 10 ; i++) {
            System.out.println(list.get(i));
        }

    }
}
