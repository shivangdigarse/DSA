public class NumOfDigits {
    public static void main(String[] args) {
        int num = 102;
        int base = 8;
        int ans;
        if(num !=0){
            ans = (int)((Math.log(num))/(Math.log(base))) + 1;
        }
        else{
            ans = -1;
        }
        System.out.println(ans);
    }
}