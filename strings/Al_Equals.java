package strings;

public class Al_Equals {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";
        String c = new String("abcd");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        // == checks memory location
        // .equals() checks actual string not memory
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

    }
}
