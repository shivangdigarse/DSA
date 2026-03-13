package sorting;


public class Ah_KthSmallestLargestElement {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int low, int high){
        int mid = low+(high-low)/2;
        int pivotEle = arr[mid];
        int smallerCount = 0;
        for(int i = low; i<=high; i++){
            if(i==mid) continue;
            else if(arr[i]<pivotEle) smallerCount++;
        }
        int correctIdx = low + smallerCount;
        swap(arr,mid,correctIdx);
        int i = low, j = high;
        while(i < correctIdx && j > correctIdx){
            if(arr[i] <= pivotEle) {
                i++;
            } else if(arr[j] > pivotEle) {
                j--;
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIdx;

    }
    public static int quickSort(int[] arr, int low, int high,int k){
        int pivotIdx = partition(arr,low,high);
        if(k == pivotIdx) return arr[pivotIdx];
        if(k < pivotIdx) return quickSort(arr, low, pivotIdx - 1, k);
        else return quickSort(arr, pivotIdx + 1, high, k);
    }
    public static void main(String[] args) {
        int[] arr = {1,8,3,5,6,7,4,9,2,4};
        int k = 2;
        int kthSmallest = quickSort(arr,0,arr.length-1,k-1);
        System.out.println("Kth Smallest Element: "+kthSmallest);
        int kthLargest = quickSort(arr,0,arr.length-1,arr.length-k);
        System.out.println("Kth Largest Element: "+kthLargest);

    }
}
