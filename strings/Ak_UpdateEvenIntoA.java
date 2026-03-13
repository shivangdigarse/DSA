package strings;

public class Ak_UpdateEvenIntoA {
    public static void main(String[] args) {
        String str = "Shivang Digarse";
        String str2 = "";
        for(int i = 0; i<str.length(); i++){
            if(i%2 == 0){
                str2 +='a';
            }
            else{
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2);
        // poor performance due to immutability
    }
}
