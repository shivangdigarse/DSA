package array;

import java.util.Arrays;

public class Ar_MatrixTranspose {
    static void display(int[][] arr){
        for(int[] ele : arr){
            for(int value: ele){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10}};
        int[][] arrTrans = new int[arr[0].length][arr.length];
        System.out.println("Before Transpose");
        display(arr);
        for(int j = 0; j<arr[0].length; j++){
            for(int i = 0; i<arr.length; i++){
                arrTrans[j][i] = arr[i][j];
            }
        }
        System.out.println("After Transpose");
        display(arrTrans);

    }
}
