package patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println("* ".repeat(2*num-1));
        num--;
        for(int i = 1; i<= num ; i++){
            for(int j = 1; j <=num+1-i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <=num+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Enter the number: 5
//        * * * * * * * * *
//        * * * *   * * * *
//        * * *       * * *
//        * *           * *
//        *               *
