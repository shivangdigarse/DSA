package patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for (int i = 1; i<= 2*num-1; i++){
            System.out.print(i +" ");
        }
        System.out.println();
        num--;
        int nps = 1;
        for(int i = 1; i<= num ; i++){
            int a = 1;
            for(int j = 1; j <=num+1-i; j++){
                System.out.print(j +" ");
                a++;
            }
            for(int j = 1; j<=nps; j++){
                System.out.print("  ");
                a++;
            }
            nps += 2;
            for(int j = a ; j <= 2*num+1; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
//Enter the number: 5
//        1 2 3 4 5 6 7 8 9
//        1 2 3 4   6 7 8 9
//        1 2 3       7 8 9
//        1 2           8 9
//        1               9