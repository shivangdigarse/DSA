package basicJava2;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Small case");
        }
        else if(ch >='A' && ch <= 'z'){
            System.out.println("Upper case");
        }
        else{
            System.out.println("Input error");
        }
        input.close();
    }
}