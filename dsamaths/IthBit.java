public class IthBit {
    public static void main(String[] args) {
        int num = 100;
        int ithBit = 3;
        System.out.println(findIthBit(num, ithBit));
    }
    static int findIthBit(int num, int ithBit){
        int mask = 1<<(ithBit-1);
        if((num & mask)==1) return 0;
        else return 1;
    }
}
