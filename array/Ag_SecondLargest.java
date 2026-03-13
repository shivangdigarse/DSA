public class Ag_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int value : arr){
            if(max < value){
                smax = max;
                max = value;
            }
            else if(value < max && value > smax){
                smax = value;
            }
        }
        System.out.println("Second Maximum: "+smax);
        System.out.println("Maximum: "+max);
    }
}
