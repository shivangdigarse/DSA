public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int start = 0;
        int end = arr.length-1;
        int target = 20;
        System.out.println(bs(arr, target, start, end));
    }
    static int bs(int[] arr, int target, int start, int end){
        if(start>end) return -1;
        int mid = (start + end)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return bs(arr, target, start, mid-1);
        else if(arr[mid]<target) return bs(arr, target, mid+1, end);
        return -1;
    }
}