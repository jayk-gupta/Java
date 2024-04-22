package Gfg.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntegers {
    public static void main(String[] args) {
        String s = "i fvdgfdd";
        ArrayList<String> l = extractIntegerWords(s);
        System.out.println(l);

    }

    static ArrayList<String> extractIntegerWords(String s) {
        String str = s.replaceAll("\\D", " ").trim().replaceAll(" +", " ");
        String[] ans = str.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(ans));
        if(list.isEmpty()) list.add("No integers");
        return list;

    }
}
