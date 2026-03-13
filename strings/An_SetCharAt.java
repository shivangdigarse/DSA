package strings;

public class An_SetCharAt {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcdefg");
        str.setCharAt(1,'z');
        System.out.println(str);
    }
}
