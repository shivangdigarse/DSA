import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the uppercase alphabet: ");
        char ch = input.next().charAt(0);
        for(int i = 65; i<= ch; i++){
            for(int j = 65; j<= ch; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
// Enter the uppercase alphabet: F
// A B C D E F 
// A B C D E F
// A B C D E F
// A B C D E F
// A B C D E F
// A B C D E F