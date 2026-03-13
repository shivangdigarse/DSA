package sorting;

import java.util.Arrays;
public class Ab_BubbleSort {
   public static void main(String[] args) {
      int[] arr = {35,21,1,3,5,87,43,0,-1,-90,38};
      bubble(arr);
      System.out.println(Arrays.toString(arr));
   }
   static int[] bubble(int[] arr){
      for(int i=arr.length-1; i>=0 ;i--){
         boolean swap=false;
         for(int j=0; j<i; j++){
            if(arr[j]>arr[j+1]){
               int temp = arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
               swap=true;
            }
         }
         if(swap==false) break;
      }
      return arr;
   }
}
// stable sort
