import java.util.*;
class DtoB{
    static int convert(int number){
        if(number==0){
            return 0;
        }
        else{
            return (number%2 + 10*convert(number/2));
        }
    }
}
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int number = input.nextInt();
        System.out.println(DtoB.convert(number));
        input.close();
    }
}
