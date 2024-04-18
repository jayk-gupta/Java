package Gfg.Basics;
//https://www.geeksforgeeks.org/problems/sort-a-string2943/1?page=2&category=Strings&sortBy=difficulty
import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "decab";
        System.out.println(sort(s));
    }

    static String sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
//        StringBuilder ans = new StringBuilder();
//        for (char c : ch) {
//            ans.append(c);
//        }
//        return ans.toString();
        String ans = new String(ch);
        return ans;
    }
}
