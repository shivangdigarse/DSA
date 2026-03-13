import java.util.Scanner;
public class Arguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println(sum(num1,num2));
        input.close();
    }
    static int sum(int n1, int n2){
        return n1+n2;
    }
}
