package searching;

public class Ah_UpperBound {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 9, 9, 10, 33};
        int target = 9;
        int start = 0;
        int end = arr.length-1;
        int up =  -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]> target){
                up = mid;
                end = mid -1;
            }
            else start = mid +1;
        }
        System.out.println(up);
    }
}
