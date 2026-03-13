public class MagicNumber {
    public static void main(String[] args) {
        int num = 6;
        int ans = 0;
        int base = 5;

        while(num>0){
            int last = (num & 1);
            ans += last * base;
            base *= 5;
            num = num >> 1;
        }

        System.out.println(ans);
    }
}
