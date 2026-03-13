package queue;

import java.util.Stack;
public class Ae_QueueByTwoStack {

    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    static void Push(int value){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(value);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    static void StackPrinter(Stack<Integer> st){
        for(int i = st.size()-1; i >=0 ; i--){
            System.out.println(st.get(i));
        }
    }
    public static void main(String[] args) {
        Push(10);
        Push(20);
        Push(30);
        StackPrinter(st1);
        System.out.println("Top element is: "+st1.peek());
    }
}
