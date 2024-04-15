package gfg.Easy.Arrays;
//https://www.geeksforgeeks.org/problems/find-the-highest-number2259/1?page=1&category=Binary%20Search&sortBy=difficulty
import java.util.ArrayList;
import java.util.List;

public class FindHighestNumber {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        System.out.println(l);
        System.out.println(findPeakElement(l));
    }

    public static int findPeakElement(List<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            int n1 = a.get(i);
            int n2 = a.get(i+1);
            if(n2<n1){
                return n1;
            }
        }

        return -1;
    }

}
