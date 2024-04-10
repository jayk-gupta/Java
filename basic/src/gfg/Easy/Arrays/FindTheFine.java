package gfg.Easy.Arrays;

import java.util.ArrayList;

public class FindTheFine {
    public static void main(String[] args) {
        long date = 3;
/*
9 3
2 10 4 7 4 4 5 3 8
2 3 10 6 4 2 5 2 8
* */
        long[] car = {2, 10, 4, 7, 4, 4, 5, 3, 8};
        long[] fine = {2, 3, 10, 6, 4, 2, 5, 2, 8};
        System.out.println(totalFine(car.length, date, car, fine));
    }

    public static long totalFine(long n, long date, long car[], long fine[]) {
//        fine odd car for even date and vice-versa
        int i = 0;
        boolean isEven = true;
        long TotalFine = 0;
//check date is even or odd
        if (date % 2 == 0) {
            isEven = false;
        }

        while (i < n) {
            if (isEven && car[i] % 2 == 0) {
                TotalFine += fine[i];

            }
            if (!isEven && car[i] % 2 != 0) {
                TotalFine += fine[i];
            }
            i++;
        }
        return TotalFine;
    }
}
