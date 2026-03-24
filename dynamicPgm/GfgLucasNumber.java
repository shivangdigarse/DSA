package dynamicPgm;

public class GfgLucasNumber {
    static final int MOD = 1000000007;

    public long lucas(int n) {
        // code here.
        if(n == 0) return 2;
        else if(n ==1) return 1;
        long prev2 = 2;
        long prev = 1;
        for(int i = 2; i<=n; i++){
            long current =  (prev2 + prev)% MOD;
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
}
