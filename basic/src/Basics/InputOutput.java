package Basics;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = in.nextInt();
        System.out.println("Enter number 2");
        int b = in.nextInt();
        System.out.println(a + b);
//        String input
        System.out.println(in.nextLine());


    }
}
