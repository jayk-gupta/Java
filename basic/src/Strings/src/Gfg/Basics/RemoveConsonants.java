package Gfg.Basics;

public class RemoveConsonants {
    public static void main(String[] args) {
        String s = "aaio";
        System.out.println(removeConsonants(s));
    }

    public static String removeConsonants(String s) {
        String S =
                s.replaceAll("[^aeiouAEIOU]", "");
       if(!S.matches(".*[aeiouAEIOU]*.")) {
           return "No Vowel";
       }
        return S;

    }
}
