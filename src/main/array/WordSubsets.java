package main.array;

import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/word-subsets/description/

 */
public class WordSubsets {

    public List<String> wordSubsets(String[] A, String[] B) {
        int[] combined = new int[26];
        for (String word : B) {
            int[] map = new int[26];
            for (char c : word.toCharArray()) {
                map[c - 'a']++;
                if (map[c - 'a'] > combined[c - 'a']) {
                    combined[c - 'a'] = map[c - 'a'];
                }
            }
        }

        List<String> retval = new ArrayList<>();
        for (String word : A) {
            int[] map = new int[26];
            for (char c : word.toCharArray()) {
                map[c - 'a']++;
            }
            boolean valid = true;
            for (int i = 0; i < combined.length; i++) {
                if (combined[i] <= map[i]) {
                    continue;
                }
                valid = false;
                break;
            }

            if (valid) {
                retval.add(word);
            }
        }
        return retval;
    }
}
