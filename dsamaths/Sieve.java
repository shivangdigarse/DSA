public class Sieve {
    // time complexity O(n*log(log n))
    public static void main(String[] args) {
        int num = 50;
        boolean[] primes = new boolean[num+1];
        sieve(primes, num);
    }
    static void sieve(boolean[] primes, int num){
        for(int i=2; i*i<= num; i++){
            if(!primes[i]){
                for(int j = i*2; j<=num; j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2; i<=num; i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}