package map;
import java.util.*;
public class mostFrequent {

        public static void main(String[] args) {
            int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
            int k = 2;

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
            entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

            System.out.println(k + " most frequent elements:");
            for (int i = 0; i < k; i++) {
                System.out.print(entryList.get(i).getKey() + " ");
            }
        }
    }


