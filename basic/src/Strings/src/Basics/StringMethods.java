package Basics;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "jay kumar gupta";
        String v = "beautiful";
        String a = "abcdefghijklmnDEFGHIJKLMN";
        String[] c1 = s.split(" ");
        String[] c2 = s.split("a");
//        REGEX
//        1. Any of a,b,c [abc]
//        2. Not a,b,c [^abc]
//        3. Range [a-z]
        String[] c3 = v.split("[aeiou]");
        String[] c4 = v.split("[^aeiou]");
        String[] c5 = a.split("[d-kD-Z]");      //d-k and D-K range

     print(c1);
     print(c2);
     print(c3);
     print(c4);
     print(c5);

    }
    static void print(String[] s){
        System.out.println(Arrays.toString(s));
    }
}
