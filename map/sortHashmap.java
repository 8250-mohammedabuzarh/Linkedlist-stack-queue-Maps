package map;

import java.util.*;

public class sortHashmap {
    public static void main(String[] args) {
        // Sample HashMap
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("apple", 3);
        sampleMap.put("banana", 1);
        sampleMap.put("cherry", 2);
        sampleMap.put("date", 4);

        // Convert entries to a list
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(sampleMap.entrySet());

        // Sort the list by values (ascending order)
        entryList.sort(Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to maintain sorted order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println(sortedMap);
    }
}

