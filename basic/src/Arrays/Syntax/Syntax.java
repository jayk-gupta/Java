package Arrays.Syntax;

import java.util.Arrays;
import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        int[] arr2 = {1,2,3,4,5};
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        /////////////////////////////////
//        Printing values of the array
//        For loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
//        Enhanced for loop
//        For every element in the array print the element
        for (int num: arr) {
            System.out.println(num +" ");
        }
//        toString method
//        converts array to string
        System.out.println(Arrays.toString(arr));
        ////////////////////////////////////////
//        Array of objects
//        String
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
//        Arrays are mutable in Java

    }
}
