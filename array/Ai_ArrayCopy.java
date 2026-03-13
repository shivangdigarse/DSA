import java.util.Arrays;

public class Ai_ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1,-23,74,3,28,285,2009};
        int[] nums = arr; // it's a shallow copy, arr and nums pointed to same array
        int[] copyArr = Arrays.copyOf(arr,arr.length); //deep copy, copyArr and arr pointing different array
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(copyArr));
    }
}
