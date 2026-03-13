package searching;

import java.util.Arrays;
public class Ae_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 29;
        System.out.println(Arrays.toString(Search(matrix, target)));
    }
    static int[] Search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;
        while(col>=0 && row<matrix.length){
            if(matrix[row][col]==target) return new int[] {row,col};
            if(matrix[row][col]>target) col--;
            if(matrix[row][col]<target) row++;
        }
        return new int[] {-1,-1};

    }
}
