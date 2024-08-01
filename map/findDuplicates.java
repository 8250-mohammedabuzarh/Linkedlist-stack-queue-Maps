package map;
import java.util.*;
public class findDuplicates {

        public static Map<Integer, Integer> findDuplicatesWithCounts(int[] nums) {
            Map<Integer, Integer> counts = new HashMap<>();

            for (int num : nums) {
                counts.put(num, counts.getOrDefault(num, 0) + 1);
            }

            // Filter out duplicates (counts > 1)
            Map<Integer, Integer> duplicates = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() > 1) {
                    duplicates.put(entry.getKey(), entry.getValue());
                }
            }

            return duplicates;
        }

        public static void main(String[] args) {
            int[] inputNums = {1, 2, 3, 2, 4, 3, 5, 6, 5, 7, 8, 8};
            Map<Integer, Integer> result = findDuplicatesWithCounts(inputNums);

            System.out.println(result);
        }
    }


