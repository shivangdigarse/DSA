package basicjava2;
import java.util.Scanner;
public class FirstPgm{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //input.nextInt(); for integer input
        //input.nextFloat(); for float input
        //input.next(); for string input till space
        //input.nextLine(); for entire string input

        System.out.println("Hello, Shivang is here");
        System.out.println(num);
        input.close();
    }
}