import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side = input.nextInt();
        for (int i = 1; i <= side; i++) {
            System.out.println("* ".repeat(side));
        }
    }
}
// Enter the side of square: 4
// * * * * 
// * * * *
// * * * *
// * * * *
