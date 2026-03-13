package array;
import java.util.Arrays;
public class An_Sort01 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1,0,0,0,0,1,0,0,1};
        int x = 0;
        int y = arr.length-1;
        while(x<=y){
            if(arr[x]==1 && arr[y]==0){
                arr[x] = 0;
                arr[y] = 1;
                x++;
                y--;
            }
            else if(arr[x]==0){
                x++;
            }
            else{
                y--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
