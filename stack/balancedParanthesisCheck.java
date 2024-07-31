package stack;

import java.util.Stack;

public class balancedParanthesisCheck{
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        String openingBrackets = "({[";
        String closingBrackets = ")}]";

        for (char c : s.toCharArray()) {
            if (openingBrackets.contains(String.valueOf(c))) {
                stack.push(c);
            } else if (closingBrackets.contains(String.valueOf(c))) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (openingBrackets.indexOf(top) != closingBrackets.indexOf(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String inputString = "{[()]";
        if (isBalanced(inputString)) {
            System.out.println("The string '" + inputString + "' contains balanced parentheses.");
        } else {
            System.out.println("The string '" + inputString + "' does not contain balanced parentheses.");
        }
    }
}
