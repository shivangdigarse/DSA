package sorting;

import java.util.Arrays;

public class Ad_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {35, 21, 1, 3, 5, 87, 43, 0, -1, -90, 38};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements greater than current to one position ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
// stable sort