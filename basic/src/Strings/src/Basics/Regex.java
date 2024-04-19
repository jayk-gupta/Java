package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        // * zero or more "a" followed by single b
//      Pattern pattern = Pattern.compile("a*b");

        // any no. of a and b    (a must be followed by b)
        Pattern pattern = Pattern.compile("a*b*");

//     +   one or more
        Pattern pattern1 = Pattern.compile("a+b+");
        //    {n} : Exact n times
        Pattern pattern2 = Pattern.compile("a{4}");

        Matcher matcher = pattern2.matcher("aaa"); //
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
