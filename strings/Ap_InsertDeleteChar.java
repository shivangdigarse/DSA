package strings;

public class Ap_InsertDeleteChar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hii kease ho");
        System.out.println(sb);
        sb.insert(2,'i');
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.append("?");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);

    }
}
