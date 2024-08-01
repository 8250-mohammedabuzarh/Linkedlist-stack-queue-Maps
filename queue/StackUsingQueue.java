package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        public StackUsingQueue() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int item) {
            queue1.add(item);
        }

        public int pop() {
            if (queue1.isEmpty()) {
                throw new IndexOutOfBoundsException("Stack is empty");
            }
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            int top = queue1.remove();
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return top;
        }

        public boolean isEmpty() {
            return queue1.isEmpty();
        }

        public int size() {
            return queue1.size();
        }

        public static void main(String[] args) {
            StackUsingQueue stack = new StackUsingQueue();
            stack.push(1);
            stack.push(2);
            stack.push(3);

            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());

            stack.push(4);
            System.out.println("Size: " + stack.size());
            System.out.println("Is empty? " + stack.isEmpty());
        }
    }

