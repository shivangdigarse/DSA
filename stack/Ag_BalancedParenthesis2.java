package stack;

import java.util.Scanner;
import java.util.Stack;
public class Ag_BalancedParenthesis2 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: (){{{}}}[((()))]");
        String str = input.nextLine();
        boolean answer = false;

        for(int i = 0; i< str.length()-1; i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[' ){
                st.push(ch);
            }

            else if(ch == ')' || ch == '}' || ch == ']' ){
                char top = st.pop();
                if(!matches(top,ch)){
                    answer = true;
                }
            }
        }
        if(answer == true){
            System.out.println("Parenthesis is not balanced");
        }
        else{
            System.out.println("Parenthesis is  balanced");
        }
    }

    static boolean matches(char top, char ch){
        return (top == '(' && ch == ')') ||
               (top == '{' && ch == '}') ||
               (top == '[' && ch == ']');
    }
}
