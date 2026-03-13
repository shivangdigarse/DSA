import java.util.Scanner;

class RC{
    static String removeChar(String str, char x, int index){
        if(index<0){
            return "";
        }
        if(str.charAt(index)==x){
            return removeChar(str, x, index-1);
        }
        else{
            return removeChar(str, x, index-1) + str.charAt(index);
        }
    }
}
public class RemoveChar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        System.out.print("Charter has to remove: ");
        char x = input.next().charAt(0);
        System.out.println(RC.removeChar(str, x, str.length()-1));
        input.close();
    }
}