import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 1; i<= num; i++){
            for(int j = 1; j<=2*i; j=j+2){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
// Enter the number: 6
// 1 
// 1 3 
// 1 3 5 
// 1 3 5 7 
// 1 3 5 7 9 
// 1 3 5 7 9 11 