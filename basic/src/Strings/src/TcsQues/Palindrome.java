package TcsQues;

public class Palindrome {
    public static void main(String[] args) {
        String s = "level";
        System.out.println(s);
        String ans =checkPalindrome(s);
        System.out.println(ans);
    }

    static String checkPalindrome(String s) {
       StringBuilder sb = new StringBuilder(s);
       sb.reverse();
       return  sb.toString();

    }
}
