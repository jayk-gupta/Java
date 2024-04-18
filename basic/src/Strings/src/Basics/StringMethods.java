package Basics;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "red ball, red bat";
        System.out.println(s);
        //////////////////////////////////////////////////////////////////////////////////////
//        Replace: The replace() method replaces each matching occurrence of a character/text in the string with the new character/text.
        String str = s.replace("red", "blue");
        System.out.println(s);
        System.out.println(str);
        //////////////////////////////////////////////////////////////////////////////////////
//        The replaceAll() method replaces each substring that matches the regex of the string with the specified text.
        String s1 = "The beautiful woman is wearing a black saree";
        String ans = s1.replaceAll("[aeiou]", ".");
        System.out.println(ans);
       ////////////////////////////////////////////////////////////////////////////////////
//        The Java substring() method extracts a part of the string (substring) and returns it.
        String s2 = "bollywood";
//                  012345678
        System.out.println(s2.substring(0, 5));   // excluding end index
//        The equals() method returns true if two strings are identical and false if the strings are different.
        String s3 = "apple";
        String s4 = "Apple";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
//        The contains() method checks whether the specified string (sequence of characters) is present in the string or not.
        String s5 = "my name is jay";
        System.out.println(s5.contains("jay"));
//        The indexOf() method returns the index of the first occurrence of the specified character/substring within the string.
    }

    static void print(String[] s) {
        System.out.println(Arrays.toString(s));
    }


    //    REGEX
    static void Regex(String[] str) {
        String s = "jay kumar gupta";
        String v = "beautiful";
        String a = "abcdefghijklmnDEFGHIJKLMN";
        String seq = "abababaaab";
        String[] c1 = s.split(" ");
        String[] c2 = s.split("a");
//        REGEX
//        1. Any of a,b,c [abc]
//        2. Not a,b,c [^abc]
//        3. Range [a-z]
        String[] c3 = v.split("[aeiou]");
        String[] c4 = v.split("[^aeiou]");
        String[] c5 = a.split("[d-kD-Z]");      //d-k and D-K range
        String[] c6 = seq.split("[.a]");
        print(c1);
        print(c2);
        print(c3);
        print(c4);
        print(c5);
        print(c6);
    }
}
