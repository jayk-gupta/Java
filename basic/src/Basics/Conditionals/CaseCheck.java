package Basics.Conditionals;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        if(ch >=65 && ch<= 96){
            System.out.println("Capital character");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("small character");
        }
        else{
            System.out.println("wrong input");
        }
    }
}
