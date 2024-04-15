package Arrays.Syntax.Questions.BasicQuestions;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8};
        System.out.println(findSecondLargest(arr, arr.length));
    }

    static int findSecondLargest(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
            if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
