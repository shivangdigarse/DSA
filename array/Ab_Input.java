package array;

import java.util.Arrays;
import java.util.Scanner;
public class Ab_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        // arr[0] = 2;
        // arr[1] = 12;
        // arr[2] = 45;
        // arr[3] = 55;
        // arr[4] = 10;
        // System.out.println(arr[2]);
        for(int i=0; i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        //enhanced for loop
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(arr));
        arr[3]=100;
        System.out.println(Arrays.toString(arr));
    }
}
