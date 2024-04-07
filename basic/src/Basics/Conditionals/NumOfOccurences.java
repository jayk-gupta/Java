package Basics.Conditionals;

import java.util.Scanner;

public class NumOfOccurences {
    public static void main(String[] args) {
        int count = 0;
        int number = 134353353;
        int val = 3;
        while (number > 0) {
            int digit = number % 10;
            if (digit == val) {
                count++;
            }
            number /= 10;

        }
        System.out.println(count);
    }
}
