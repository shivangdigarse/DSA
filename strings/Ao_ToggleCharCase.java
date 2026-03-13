package strings;

public class Ao_ToggleCharCase {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("ShivAnG diGarSE");
        System.out.println(str);
        int len = str.length();
        for(int i = 0; i<len; i++){
            int ascii = (int)str.charAt(i);
            if(65<=ascii && ascii<=90){
                ascii += 32;
                str.setCharAt(i,(char)ascii);
            }
            else if(97<=ascii && ascii<=122){
                ascii -= 32;
                str.setCharAt(i,(char)ascii);
            }
        }
        System.out.println(str);
    }
}
