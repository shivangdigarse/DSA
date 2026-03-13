public class Ak_FindDoubletSum {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = {1,3,5,7,9,2,4,6,8,12,13,24,36,45};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == num){
                    System.out.println("Pair indices: "+i +" "+j);
                }
            }
        }
    }
}
