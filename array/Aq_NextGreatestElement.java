package array;

import java.util.Arrays;

public class Aq_NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {1,3,6,23,65,12,6,4};
        int[] result = new int[arr.length];
        int max = arr[arr.length-1];
        result[arr.length-1] = -1;
        for(int i = arr.length-2; i>=0; i--){
            result[i] = max;
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
