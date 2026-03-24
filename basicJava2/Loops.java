package basicJava2;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+ num*i);
        }
        System.out.println();
        int i=1;
        while(i<=10){
            System.out.println(num+" x "+i+" = "+ num*i);
            i++;
        }
        System.out.println();
        i=1;
        do{
            System.out.println(num+" x "+i+" = "+ num*i);
            i++; 
        }while(i<=10);
        input.close();
    }
}