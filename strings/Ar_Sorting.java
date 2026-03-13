package strings;

import java.util.Arrays;

public class Ar_Sorting {
    public static void main(String[] args) {
        String str = "shivang";
        System.out.println(str);
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(char ele : arr){
            System.out.print(ele);
        }
    }
}
