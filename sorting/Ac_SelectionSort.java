package sorting;

import java.util.Arrays;

public class Ac_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {35,21,1,3,5,87,43,0,-1,-90,38};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
// Unstable sort