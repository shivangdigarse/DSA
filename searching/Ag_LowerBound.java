package searching;

public class Ag_LowerBound {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 9, 9, 10, 33};
        int target = 1;
        int start = 0;
        int end = arr.length-1;
        int lb =  arr.length;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                lb = Math.min(mid,lb);
                end = mid-1;
            }
            else start = mid+1;
        }
        System.out.println(lb);
    }
}
