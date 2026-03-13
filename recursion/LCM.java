package recursion;

import java.util.Scanner;

class Demo{
    static int common = 1;
    static int lcm(int num1, int num2){
        if(common%num1 == 0 && common%num2 == 0){
            return common;
        }
        common++;
        lcm(num1, num2);
        return common;
    }
}

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println(Demo.lcm(num1, num2));
        input.close();
    }
}
