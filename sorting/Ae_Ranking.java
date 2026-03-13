package sorting;

import java.util.Arrays;

/*
Given an array with N distinct elements, convert the given array to a form where all elements are in the range from 0 to N-1.
The order of elements is the same, i.e.,
- 0 is placed in the place of the smallest element,
- 1 is placed for the second-smallest element,
- …
- N-1 is placed for the largest element.
*/
public class Ae_Ranking {
    public static void ranking(int[] arr){
        int n = arr.length;
        int rank = 0;
        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j = 0; j < n; j++){
                if(arr[j] < min && arr[j]>0){
                    min = arr[j];
                    minIdx = j;
                }
            }
            arr[minIdx] = rank;
            rank--;
        }
        for(int i = 0; i<n; i++){
            arr[i] *= -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 30, 20, 50};
        System.out.println(Arrays.toString(arr));
        ranking(arr);
        System.out.println(Arrays.toString(arr));
    }
}
