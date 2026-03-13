package strings;

public class Ah_UpperLowerCase {
    public static void main(String[] args) {
        String str = "hii, Kesa Hai tu";
        str.toLowerCase();  //it will do nothing, save it in any string for changes
        System.out.println(str);
        String strl = str.toLowerCase();
        System.out.println(strl);

        System.out.println(str.concat(strl));  // no changes in str ans strl
    }
}
