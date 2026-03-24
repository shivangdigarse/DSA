package basicJava1;
import java.util.Scanner;

class Swap{
    void swaping(int x,int y){
        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("Swapped values: x = " + x + ", y = " + y);
    }
}
public class Swap1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int x = input.nextInt();
        System.out.print("Enter the second value: ");
        int y = input.nextInt();

        Swap s1 = new Swap();
        s1.swaping(x, y);

        input.close();
    }
}
