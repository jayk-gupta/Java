package TcsQues;

import java.util.Arrays;

public class CapitalizeFirstLastChar {
    public static void main(String[] args) {
        String s = "good night how are you";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            char ch = str[i].charAt(0);
            char upperCase = Character.toUpperCase(ch);
            String ans = upperCase + str[i].substring(1);

        }
        System.out.println(Arrays.toString(str));
    }
}
