package main.hashmap;
/*

https://leetcode.com/problems/uncommon-words-from-two-sentences/description/

 */

import java.util.*;

public class UncommonWordsfromTwoSentences {

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();
        for (String word : A.split(" ")) {
            firstMap.put(word, firstMap.getOrDefault(word, 0) + 1);
        }

        for (String word : B.split(" ")) {
            secondMap.put(word, secondMap.getOrDefault(word, 0) + 1);
        }

        List<String> res = new ArrayList<>();

        for (String key : firstMap.keySet()) {
            int counter = firstMap.get(key);
            if (counter == 1 && !secondMap.containsKey(key)) {
                res.add(key);
            }
        }

        for (String key : secondMap.keySet()) {
            int counter = secondMap.get(key);
            if (counter == 1 && !firstMap.containsKey(key)) {
                res.add(key);
            }
        }

        return res.toArray(new String[res.size()]);
    }
}
