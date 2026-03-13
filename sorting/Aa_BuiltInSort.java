package sorting;

import java.util.Arrays;

public class Aa_BuiltInSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,4,0,-10};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
