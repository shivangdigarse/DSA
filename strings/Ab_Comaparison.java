package strings;

public class Ab_Comaparison {
    public static void main(String[] args) {
        String a = "Shivang";
        String b = "Shivang";

        // == is a compator operator
        /* it is check to use refrence variable are pointing to the same object or not
         * a--->"Shivang"<---b  return true
         * a--->"Shivang"   b--->"Shivang"  return false
        */
        
        System.out.println(a==b);

        String c = "Digarse";
        String d = new String("Digarse");

        System.out.println(c==d);

        /*
         * str1.equals(str2)
         *it use to check the values of two strings are same or not, it not check that string have same pointer or not
        */

        System.out.println(c.equals(d));
    }
}
