package strings;

public class Ae_PrettyPrinting {
    public static void main(String[] args) {
        float num = 123.1234f;
        System.out.printf("Formated number %.2f",num);
        // formate string
        System.out.println();
        
        float num1 = 123.1298f;
        System.out.printf("%.2f",num1);
        System.out.println();

        System.out.printf("Pie: %.3f",Math.PI);
        System.out.println();

        System.out.printf("Hello my name is %s and I am a %s", "Shivang", "Student");
        // %s is called as placeholder 
        
    }
}
