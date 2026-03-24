public class SetIthBit1 {
    public static void main(String[] args) {
        int num = 100;
        int ithBit = 4;
        System.out.println(setIthBit(num, ithBit));
    }static int setIthBit(int num, int ithBit){
        int mask = 1<<(ithBit-1);
        return (num | mask);
    }
}
