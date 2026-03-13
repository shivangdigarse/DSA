package array;

import java.util.Arrays;

public class At_Rotate90Degree {
    //LC 48
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {2,5,8}
        };
        int[][] arrTrans = new int[arr[0].length][arr.length];
        for(int j = 0; j<arr[0].length; j++){
            for(int i = 0; i<arr.length; i++){
                arrTrans[j][i] = arr[i][j];
            }
        }
        for(int[] ele : arrTrans){
            int i = 0;
            int j = ele.length-1;
            while(i<j){
                int temp = ele[i];
                ele[i] = ele[j];
                ele[j] = temp;
                i++;
                j--;
            }
        }
        for(int[] ele: arrTrans){
            System.out.println(Arrays.toString(ele));
        }
    }
}
