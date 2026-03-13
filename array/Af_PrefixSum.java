import java.util.Scanner;

public class Af_PrefixSum {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] arr = {
        {1,1,1,1},
        {1,1,1,1},
        {1,1,1,1},
        {1,1,1,1}
    };
    System.out.println("Enter first cordinates");
    System.out.print("Row: ");
    int row1 = input.nextInt();
    System.out.print("Column: ");
    int col1 = input.nextInt();
    System.out.println("Enter second cordinates"); 
    System.out.print("Row: ");
    int row2 = input.nextInt();
    System.out.print("Column: ");
    int col2 = input.nextInt();
    int sum = 0;
    for(int i = Math.min(row1,row2); i<= Math.max(row1,row2);i++){
        for(int j = Math.min(col1,col2); j<=Math.max(col1,col2);j++){
            sum += arr[i][j];
        }
    }
    System.out.println("Sum: "+sum);
}
}
