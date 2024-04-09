package Arrays.Syntax.Questions.BasicQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverseArray( arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr,i, arr.length-i-1);
        }
    }
    static void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
