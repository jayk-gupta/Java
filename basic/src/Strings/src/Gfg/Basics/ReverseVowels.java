package Gfg.Basics;
//XXXXXXXXXXXXXXXXXXXXXX
public class ReverseVowels {
    public static void main(String[] args) {
        String s = "beautiful";
        System.out.println(modify(s));
    }

    static String modify(String s) {
        String ans = s.replaceAll("[^aeiouAEIOU]", "");
        StringBuilder b = new StringBuilder();
        b.append(ans).reverse();
        return b.toString();
    }
}
