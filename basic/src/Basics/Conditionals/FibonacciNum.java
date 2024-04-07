package Basics.Conditionals;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
//        0,1,1,2,3,5,8,13....
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num of values to find");
        int num = in.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1+n2);
        for (int i =0;i<=num;i++){
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
