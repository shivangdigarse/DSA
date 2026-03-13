package array;

import java.util.Arrays;

public class Ao_Sort012 {
    public static void main(String[] args) {
        int[] arr = {2,0,1,2,1,0,1,1,2,0,0};
        int x = 0;
        int y = 0;
        int z =  arr.length-1;
        while(y<z){
            if(arr[y]==0){
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y++;
            }
            else if(arr[y]==1){
                y++;
            }
            else if(arr[y] == 2){
                int temp = arr[z];
                arr[z] = arr[y];
                arr[y] = temp;
                z--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
