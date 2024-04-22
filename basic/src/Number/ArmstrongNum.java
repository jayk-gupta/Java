import java.util.ArrayList;

public class ArmstrongNum {
    public static void main(String[] args) {
        long num = 370;
        System.out.println(checkArmstrongNum(num));
    }

    static boolean checkArmstrongNum(long num) {
        ArrayList<Long> l = new ArrayList<>();
        long originalNum = num;
        long sum = 0;
        long noOfDigits = 0;
        long r = 0, q = 0;
        while (num > 0) {
            noOfDigits++;
            r = num % 10;
            l.add(r);
            num = num / 10;
        }
        System.out.println(l);
        System.out.println(noOfDigits);
        for (int i = 0; i < l.size(); i++) {
            sum += (long) Math.pow(l.get(i), noOfDigits);
        }
        
        System.out.println(sum);
        if (sum == originalNum) {
            return true;
        }

        return false;
    }
}
