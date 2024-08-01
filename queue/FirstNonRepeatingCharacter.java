package queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

        public static void findFirstNonRepeating(String stream) {
            Queue<Character> queue = new LinkedList<>();
            Map<Character, Integer> charCount = new HashMap<>();

            for (char ch : stream.toCharArray()) {
                // Update the frequency map
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

                // Add the character to the queue
                queue.add(ch);

                // Remove characters from the queue until the front is non-repeating
                while (!queue.isEmpty() && charCount.get(queue.peek()) > 1) {
                    queue.remove();
                }

                // Print the first non-repeating character
                if (!queue.isEmpty()) {
                    System.out.println("First non-repeating character: " + queue.peek());
                } else {
                    System.out.println("No non-repeating character found");
                }
            }
        }

        public static void main(String[] args) {
            String stream = "aabc";
            findFirstNonRepeating(stream);
        }
    }

