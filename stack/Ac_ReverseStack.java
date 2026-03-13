package stack;

import java.util.Stack;

public class Ac_ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> revStk = new Stack<>();
        stk.push(2);
        stk.push(4);
        stk.push(10);
        stk.push(32);
        stk.push(54);
        stk.push(98);
        System.out.println(stk);

        while(!stk.isEmpty()) {
            revStk.push(stk.pop());
        }
        System.out.println(revStk);
    }
}
