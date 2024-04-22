import java.util.ArrayList;

public class CheckNumber {
    public static void main(String[] args) {
        int num = 1333351;
        int min = 100;
        int max = 300;
//        System.out.println(checkPalindrome(num));
//        System.out.println(CheckPrime(79));
        ArrayList<Integer> list = new ArrayList<>();
//        list = checkPalindromeInRange(min, max);
        list = CheckPrimeInRange(1, 100);
        System.out.println(list);
    }

    // CHECK PALINDROME NUMBER
    static boolean checkPalindrome(int num) {
        int originalNum = num;
        int sum = 0;
        int r = 0, q = 0;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum * 10 + r;
        }
        System.out.println(sum);
        return originalNum == sum;
    }

    // CHECK PALINDROME NUMBER (IN A RANGE)
    static ArrayList<Integer> checkPalindromeInRange(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            int originalNum = i;
            int num = i;
            int sum = 0;
            int r = 0, q = 0;
            while (num > 0) {
                r = num % 10;
                num = num / 10;
                sum = sum * 10 + r;
            }
            if (originalNum == sum) list.add(sum);
        }
        return list;
    }

    // CHECK IF A NUMBER IS PRIME
    static boolean CheckPrime(int num) {
        if (num == 1) return true;
        int n = 2;
        while (n * n <= num) {
            if (num % n == 0) {
                return false;
            }
            n++;
        }
        return true;
    }

    // CHECK IF A NUMBER IS PRIME
    static ArrayList<Integer> CheckPrimeInRange(int min, int max) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            int num = i;
            if (num <= 1) {
                continue;
            }
            boolean isPrime = true;
            int n = 2;
            while (n * n <= num) {
                if (num % n == 0) {
                    isPrime = false;
                    break;
                }
                n++;

            }
            if (isPrime) {
                l.add(num);
            }

        }

        return l;
    }
//
}

