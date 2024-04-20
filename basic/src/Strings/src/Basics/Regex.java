package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        // * zero or more "a" followed by single b
       //  Pattern pattern = Pattern.compile("a*b");

        // any no. of a and b    (a must be followed by b)
        Pattern pattern = Pattern.compile("a*b*");

        //  +   one or more
        Pattern pattern1 = Pattern.compile("a+b+");
        //  {n} : Exact n times
        Pattern pattern2 = Pattern.compile("a{4}");
//        /d : digit
        Pattern pattern3 = Pattern.compile("a{4}");
//        /s : whitespace
//        /w :word
//        [abc] : a,b or c
//        [^abc] : any char except a,b,c
//        [a-z]: range
//        [a-zA-Z] : range
//       union: a through d or m through p: [a-d[m-p]]
//        intersection:   [a-z&&[def]: def (intersection of a-z and def)
//        [a-z&&[^bc]]: expect bc a to z

        Matcher matcher = pattern2.matcher("aaa"); //
        boolean matches = matcher.matches();
        System.out.println(matches);
//        ///////////////////////////////////////////////
//        Single step
//        Pattern.matches(regex)
    }
}
