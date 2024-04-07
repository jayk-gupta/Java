package Basics;

import java.util.Scanner;

public class TypeConversionAndCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        float num = in.nextFloat();
//        System.out.println(num);
/*
* 1. types should be compatible
* 2. Destination type > source types : Bigger to smaller is casted
*/

//        Type casting : Bigger to smaller type explicitly
//        int n = (int)45.3434f;
//        System.out.println(n);

        //////////////////////////////////////////
//        Automatic type promotion in expressions
//        stores the remainder of the maximum value
//        int a = 260;
//        byte b = (byte)a; // 1byte = 256 bits
//        System.out.println(b); //4 = 260 % 256

//        Example
        byte a = 10;
        byte b = 50;
        byte c =100;
        int d = a*b/c; // expression is promoted to int
        System.out.println(d);

//        char
        int ch = 'A';
        System.out.println(ch); //65
        System.out.println("नमस्ते");
//        RULES:
//        1. Byte,short,char => int
//        if any one value if float in expression whole expression promoted to float
        System.out.println(4*56*4.545);
    }
}
