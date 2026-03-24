package dsaMaths;
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 106;
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c =2;
        while(c*c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
