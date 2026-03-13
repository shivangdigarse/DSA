package searching;

public class Ac_CeilingNo {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        System.out.println(Ceiling(arr,9));
    }
    //Ceiling no. :- Smallest no. in array greater than or equal to target no.
    static int Ceiling(int[] arr, int target){
        int start, end, mid;
        start = 0;
        end = arr.length-1;
        while(start<=end){
            mid = start +(end - start)/2;
            if(arr[mid]==target) return arr[mid];
            else if(arr[mid]<target) start = mid + 1;
            else if(arr[mid]>target) end = mid -1;
        }
        return arr[start];
    }
}
