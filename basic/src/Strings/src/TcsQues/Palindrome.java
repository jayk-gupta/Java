package TcsQues;

public class Palindrome {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(s);
boolean ans =checkPalindrome2(s);
        System.out.println(ans);
    }

    static String checkPalindrome(String s) {
       StringBuilder sb = new StringBuilder(s);
       sb.reverse();
       return  sb.toString();

    } static Boolean checkPalindrome2(String s) {
       char[] ch = s.toCharArray();
       int st = 0;
       int end = ch.length-1;
        while (st<=end){
                       if(ch[st] == ch[end]){
                           st++;
                           end--;
                       }
                       else{
                           return false;
                       }
        }
              return true;
    }
}
