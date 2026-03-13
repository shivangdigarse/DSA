import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 1; i<= num; i++){
            for(int j = 1; j<= num; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
// Enter the number: 5
// 1 2 3 4 5 
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5