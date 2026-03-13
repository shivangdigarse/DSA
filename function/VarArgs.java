import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,52,74,12,56,89,415,2);
        fun2(2,4,"Shivang","Shivam","Renu");
    }
    static void fun(int ...v){//by 3 dots we can give multiple arguments
        System.out.println(Arrays.toString(v));
    }
    static void fun2(int a, int b, String ...v){
    }
}
