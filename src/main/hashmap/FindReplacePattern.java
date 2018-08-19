package main.hashmap;
/*

https://leetcode.com/contest/weekly-contest-98/submissions/detail/170289589/

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList();
        for (String word : words) {
            if (match(word, pattern) && match(pattern, word)) {
                res.add(word);
            }
        }
        return res;
    }


    private boolean match(String str1, String str2) {
        char[] pChars = str2.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        char[] chars = str1.toCharArray();
        boolean matched = true;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            char p = pChars[i];
            if (map.containsKey(p)) {
                if (c != map.get(p)) {
                    matched = false;
                    break;
                }
            } else {
                map.put(pChars[i], c);
            }

        }
        return matched;
    }
}
