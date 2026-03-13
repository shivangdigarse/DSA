import java.util.Scanner;

class A{
    static int sumOfDigit(int number){
        if(number==0){
            return 0;
        }
        int lastDigit = number%10;
        number /= 10;
        return lastDigit + sumOfDigit(number);
    }
}

public class SumOfDigit {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(A.sumOfDigit(number));
        input.close();
    }
}
