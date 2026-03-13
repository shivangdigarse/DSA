package array;

import java.util.Arrays;

public class Ap_MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length || j<arr2.length){
            if(i<arr1.length && j<arr2.length){
                if(arr1[i]<=arr2[j]){
                    arr[k] = arr1[i];
                    k++;
                    i++;
                }
                else{
                    arr[k] = arr2[j];
                    k++;
                    j++;
                }
            }
            else if(i< arr1.length){
                arr[k] = arr1[i];
                k++;
                i++;
            }
            else if(j< arr2.length){
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
