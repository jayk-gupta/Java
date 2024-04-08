package Arrays.Syntax.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
1 2 3
4 5 6
7 8 9
 */

//        Number of columns is not mandatory to give
        int[][] arr = new int[3][3];
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Enter 9 elements");
//        Length of array = no. of rows
        for (int i = 0; i < arr.length; i++) {
//            for each column in every row
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
//            for each column in every row
//            Every array at that row , the length of that array
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
