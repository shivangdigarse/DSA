public class FIndUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,6,5,4,3,2};
        System.out.println(checkUnique(arr));
    }
    static int checkUnique(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
