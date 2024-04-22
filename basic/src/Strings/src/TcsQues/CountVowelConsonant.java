package TcsQues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String s = "beautiful";
//        * one or more and + zero or more
        Pattern p = Pattern.compile("([aeiou])");
        Matcher m = p.matcher(s) ;
        while (m.find()){
//            System.out.println("Number of groups: "+ m.group());
            System.out.println(m.group());
        }
    }

}
