package sorting;

import java.util.Arrays;

public class Af_MergeSort {
    public static void mergeSort(int[] arr,int low, int high){
        if(low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low +1;
        int n2 = high - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i = 0; i<n1; i++){
            arr1[i] = arr[low+i];
        }
        for(int i = 0; i<n2; i++){
            arr2[i] = arr[mid+1+i];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while(i<n1 && j<n2){
            if(arr1[i]<= arr2[j]) arr[k++] = arr1[i++];
            else arr[k++] = arr2[j++];
        }
        while(i < n1) arr[k++] = arr1[i++];
        while(j < n2) arr[k++] = arr2[j++];
    }
    public static void main(String[] args) {
        int[] arr = {1,8,3,5,6,7,4,9,2};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
//Stable sort