package basicjava2;
import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the fruit: ");
        String fruit = input.next();
        switch (fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Enter valid fruit");
        }
        input.close();
    }
}