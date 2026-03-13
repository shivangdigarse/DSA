import java.util.Scanner;
public class IncorrectSwap {
    public static void main(String[] args) {
        //in java there is nothing like pass by refrence,
        //there is only pass by value for primitive data types only
        //therefore one the copy variables i.e. n1 and n2 swaps, not the original i.e. num1 and num2
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        swapnum(num1,num2);
        System.out.println(num1+ " " + num2);
        input.close();
    }
    static void swapnum(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}
