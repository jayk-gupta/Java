package Arrays.Syntax.Questions.BasicQuestions;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {-20,4,12,54,82,-50,16,-31};
        int ans = findLargestNum(arr);
        System.out.println(ans);

    }

    static int findLargestNum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
