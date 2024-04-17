package Gfg.Basics;

import java.util.Arrays;

public class CountTypeOfChars {
    public static void main(String[] args) {
        String name = "My Name is JAY KUMAR Gupta";
        int[] ans = count(name);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] count(String s) {
        int upperCase = 0;
        int lowerCase = 0;
        int[] ans = {0,0};

        String str = s.replace(" ", "");
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
//            A-65 Z-90
//            SMALL: 97-122
            if (chars[i] >= 65 && chars[i] <= 90) {
                upperCase++;
            }
            if (chars[i] >= 97 && chars[i] <= 122) {
                lowerCase++;
            }
        }
      ans[0] = upperCase;
        ans[1] = lowerCase;
        return ans;
    }
}


