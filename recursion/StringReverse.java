
import java.util.Scanner;

class Demo{
    static String strRev(String str){
        if(str == null || str.length()<=1){
            return str;
        }
        return strRev(str.substring(1))+ str.charAt(0);
    }
}

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        System.out.println(Demo.strRev(str));
        input.close();
    }
}
