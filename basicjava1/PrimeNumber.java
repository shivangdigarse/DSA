import java.util.Scanner;

class Prime{
    static void check(int number){
        int factor = 0;
        for (int i = 1; i<= number/2; i++){
            if(number%i == 0){
                factor ++;
            }
            if(factor ==3){
                System.out.println("Not a prime number");
                break;
            }
        }
        if(factor == 2){
            System.out.println("It is a prime number");
        }
    }
}
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        Prime p = new Prime();
        p.check(number);
        input.close();

    }
}