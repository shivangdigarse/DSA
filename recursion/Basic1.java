public class Basic1 {
    public static void main(String[] args){
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        if(n<10){
            print(n+1);
        }
    }
}