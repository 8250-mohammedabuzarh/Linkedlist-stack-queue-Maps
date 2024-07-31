package stack;

import java.util.Stack;

public class sortStack {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    public static void insertSorted(Stack<Integer> stack, int item) {
        if (stack.isEmpty() || stack.peek() <= item) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertSorted(stack, item);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(34);
        myStack.push(3);
        myStack.push(31);
        myStack.push(98);
        myStack.push(92);
        myStack.push(23);

        System.out.println("Original stack: " + myStack);
        sortStack(myStack);
        System.out.println("Sorted stack: " + myStack);
    }
}
