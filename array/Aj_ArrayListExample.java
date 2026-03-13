import java.util.ArrayList;
import java.util.Scanner;
public class Aj_ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //its same as the vector in cpp
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(25);
        list.add(21);
        list.add(65);
        //input items into a arrayList
        System.out.println(list);
//        for(int i = 0; i<9; i++){
//            list.add(input.nextInt());
//        }
        System.out.println(list);
        //get a item of specific index
        System.out.println(list.get(1));

        list.set(1,100);
        System.out.println(list); // update index 1

        System.out.println(list.size());  // size and capacity is different in array

    }
}
