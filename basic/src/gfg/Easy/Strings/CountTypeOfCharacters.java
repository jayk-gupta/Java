package gfg.Easy.Strings;

import java.util.Arrays;

public class CountTypeOfCharacters {
    public static void main(String[] args) {
        String name = "My Name is JAY KUMAR Gupta";
        int[] ans = count(name);
        System.out.println(Arrays.toString(ans));
    }

   public static int[] count(String s) {

        String str = s.replace(" ", "");
        System.out.println(str);
        return  new int[] {-1};
    }
}
