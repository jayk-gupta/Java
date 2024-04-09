package gfg.Easy.Arrays;

public class NumOfPizzasEat {
    public static void main(String[] args) {
/*
* 2 7 1 15 15 9 6 14 15 10
1 6 14 15 15 15 7 9 2 10
* */
        int[] stack1 = {2, 7, 1 ,15, 15, 9, 6, 14, 15, 10};
        int[] stack2 = {1 ,6, 14 ,15, 15 ,15, 7 ,9 ,2, 10};
        int ans = getCommon(stack1,stack2);
        System.out.println(ans);
    }
    public static int getCommon(int stack1[], int stack2[]) {
        int count= 0;
//        Need to find common elements in two arrays
        for (int i = 0; i < stack1.length; i++) {
            for (int j = 0; j < stack2.length; j++) {
                if(stack1[i] == stack2[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
