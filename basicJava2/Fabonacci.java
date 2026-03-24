package basicJava2;

import java.util.Scanner;
public class Fabonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = input.nextInt();
        int firstPre = 0;
        int secPre = 1;
        System.out.println(firstPre);
        System.out.println(secPre);
        for (int i =0; i<num-2; i++){
            int sum = firstPre+secPre;
            System.out.println(sum);
            firstPre = secPre;
            secPre = sum;
        }
        input.close();
    }
}