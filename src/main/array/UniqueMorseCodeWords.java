package main.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {

    String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    String letters = "abcdefghijklmnopqrstuvwxyz";

    public int uniqueMorseRepresentations(String[] words) {
        if (words == null) {
            return 0;
        }

        Map<Character, String> myMap = new HashMap<>();
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            myMap.put(c, morseCodes[i]);
        }
        Set<String> mySet = new HashSet<>();

        for (String word : words) {
            StringBuilder transformed = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                transformed.append(myMap.get(c));
            }
            mySet.add(transformed.toString());
        }

        return mySet.size();
    }
}
