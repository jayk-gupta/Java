package Basics;

import java.util.Arrays;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.toString());
//        to char array
        String c = "AppLE";
        System.out.println(Arrays.toString(c.toCharArray()));
        System.out.println(c.toLowerCase());
        System.out.println(c.indexOf('p'));
        String s = "       Green    Apple  ";
        System.out.println(s);
        System.out.println(s.strip());
        System.out.println(s.concat(c));
        System.out.println(s.replace('e','E'));
        String fruit = "banana";
// split returns array of characters
        System.out.println(Arrays.toString(fruit.split("a")));

    }
}
