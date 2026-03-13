
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j<= num-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = i-1 ; j>= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// Enter the number: 5
//     1
//    121
//   12321
//  1234321
// 123454321