package searching;

import java.util.Arrays;

public class Af_SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18}
        };
        int target = 2;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] {row, col};
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return new int[] {-1, -1}; // Not found
    }
}
