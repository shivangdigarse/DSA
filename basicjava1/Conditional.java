package basicjava1;
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if(num==0){
            System.out.println("Number is Zero");
        }
        else if(num>0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Negative");
        }
        input.close();
    }
}
