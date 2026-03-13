package strings;

import java.util.ArrayList;
public class Ad_Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);//integer is converted into Integer that will call toString()
        System.out.println("Shivang" + new ArrayList<>());
        System.out.println("Shivang" + new Integer(56));
        //concatnation operator is only works with primitive data types and non primitive if when one operand is string
        
    }
}
