package map;

import java.util.*;

public class AnagramGrouping {

        public static List<List<String>> groupAnagrams(String[] strings) {
            Map<String, List<String>> anagrams = new HashMap<>();

            for (String s : strings) {
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                String sortedString = new String(charArray);

                anagrams.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(s);
            }

            return new ArrayList<>(anagrams.values());
        }

        public static void main(String[] args) {
            String[] inputStrings = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> result = groupAnagrams(inputStrings);

            for (List<String> group : result) {
                System.out.println(group);
            }
        }
    }


