package stack;

import java.util.Scanner;
import java.util.Stack;

public class Af_BalancedParenthesis {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the parenthesis string: ");
        String str = input.nextLine(); // or use your hardcoded string

        boolean isBalanced = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char top = stack.pop();
                if (!matches(top, ch)) {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced && stack.isEmpty()) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are not balanced");
        }
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}