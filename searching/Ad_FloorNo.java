package searching;

public class Ad_FloorNo {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        System.out.println(Floor(arr,19));
    }
    //Floor no. :- Greatest no. in array smaller than or equal to target no.
    static int Floor(int[] arr, int target){
        int start, end, mid;
        start = 0;
        end = arr.length-1;
        while(start<=end){
            mid = start +(end - start)/2;
            if(arr[mid]==target) return arr[mid];
            else if(arr[mid]<target) start = mid + 1;
            else if(arr[mid]>target) end = mid -1;
        }
        return arr[end];
    }
}
