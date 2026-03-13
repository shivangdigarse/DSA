import java.util.Arrays;

public class Am_RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int k = 4;
        k = k % arr.length;
        rotate(arr,0,arr.length-k-1);
        rotate(arr,arr.length-k,arr.length-1);
        rotate(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr,int x, int y){
        while(x<y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
    }
}
