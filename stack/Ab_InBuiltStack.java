package stack;

import java.util.Stack;

public class Ab_InBuiltStack {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        // Push
        st.push(10);
        st.push(12);
        st.push(30);

        // Top → [30, 20, 10] ← Bottom

        // Peek element
        System.out.println("Peek element: "+ st.peek());

        // Pop
        System.out.println("Poped element: "+ st.pop());

        System.out.println("Peek element: "+ st.peek());

        // Check if empty
        System.out.println("Is empty: "+ st.isEmpty());

        // Search an element
        System.out.println("Position of 10 : "+ st.search(10));

        // Stack size
        System.out.println("Size: "+ st.size());

    }
}
