package map;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(characterFrequency(str));
    }

    public static Map<Character, Integer> characterFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
