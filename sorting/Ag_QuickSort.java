package sorting;

import java.util.Arrays;

public class Ag_QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr,int low, int high){
        int mid = low + (high - low) / 2;
        int pivot = arr[mid], pivotIdx = mid;

        int smallerCount = 0;
        for(int i = low; i <= high; i++){
            if(i == mid) continue;
            if(arr[i] <= pivot) smallerCount++;
        }

        int correctIdx = low + smallerCount;
        swap(arr, pivotIdx, correctIdx);

        int i = low, j = high;
        while(i < correctIdx && j > correctIdx){
            if(arr[i] <= pivot) {
                i++;
            } else if(arr[j] > pivot) {
                j--;
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIdx;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int pivotIdx = partition(arr, low, high);
        quickSort(arr, low, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1,8,3,5,6,7,4,9,2};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
//Unstable sort