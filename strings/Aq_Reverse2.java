package strings;

public class Aq_Reverse2 {
    public static void reverse(StringBuilder sb, int i, int j){
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hi my name is shivang");
        System.out.println(str);
        int i = 0;
        int j = 0;
        while(j<str.length()){
            if(str.charAt(j) != ' ') j++;
            else{
                reverse(str,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(str,i,j-1);
        System.out.println(str);
    }
}
