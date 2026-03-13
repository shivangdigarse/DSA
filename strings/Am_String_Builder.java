package strings;

public class Am_String_Builder {
    public static void main(String[] args) {
        StringBuilder alphabet = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            alphabet.append(ch);
        }
        System.out.println(alphabet);

        //we cant take stringbuilder input directly
        //first input string then convert it into string builder
        //StringBuilder strb = new StringBuilder(input.nextLine());
    }
}
