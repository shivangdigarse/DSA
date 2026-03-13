package strings;

public class Af_IndexOf {
    public static void main(String[] args) {
        String str = "Shivang Digarse";
        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('z'));
        System.out.println(str.lastIndexOf('a'));

        System.out.println(str.contains(" Dig"));
        System.out.println(str.startsWith("Shi"));
        System.out.println(str.startsWith("hi"));

    }
}
