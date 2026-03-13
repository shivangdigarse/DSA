package searching;

import java.util.Arrays;
import java.util.Scanner;
public class Aa_LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[15];
        System.out.print("Enter 15 elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Which element you want to search:");
        int target = input.nextInt();
        System.out.println(linearSearch(arr, target));
    }
    static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
