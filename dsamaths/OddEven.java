public class OddEven {
    public static void main(String[] args) {
        int num = 80;
        checkOddEven(num);
    }
    static void checkOddEven(int num){
        if((num & 1) == 1){
            System.out.println(num + ": Odd number");
        }
        else if((num & 1) == 0){
            System.out.println(num + ": Even number");
        }
    }
}
