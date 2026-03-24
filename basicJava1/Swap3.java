import java.util.Scanner;

// can't use this method if any variable is zero

class Swap {
    void swaping(int x, int y) {
        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("Swapped values: x = " + x + ", y = " + y);
    }
}

public class Swap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int x = input.nextInt();
        System.out.println("Enter the second value: ");
        int y = input.nextInt();

        Swap s1 = new Swap();
        s1.swaping(x, y);
        
        input.close();
    }
}