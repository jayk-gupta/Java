package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeQues {
    public static void main(String[] args) {
        String s = "AGHS43a65iy9";
        String num = "832510321"   ;
//        checkString(s);
        check10DigitNum(num);
    }

    static void checkString(String s) {
//        [a-zA-Z0-9]  : it returns only a single char
//        +: one or more than one
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
        Matcher matcher = pattern.matcher(s);
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
    static void check10DigitNum(String s){
        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m = p.matcher(s);
        System.out.println(m.matches());
    }

}
