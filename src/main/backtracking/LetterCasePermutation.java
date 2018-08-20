package main.backtracking;

import java.util.ArrayList;
import java.util.List;

/*

   https://leetcode.com/problems/letter-case-permutation/description/

*/

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        if (S == null) return list;
        if (S.length() == 0) {
            list.add(S);
            return list;
        }
        helper("", S, list);
        return list;
    }

    private void helper(String prefix, String s, List<String> list) {
        if (s.length() == 1) {
            if (Character.isAlphabetic(s.charAt(0))) {
                list.add(prefix + s.toLowerCase());
                list.add(prefix + s.toUpperCase());
            } else {
                list.add(prefix + s);
            }
            return;
        }
        char c = s.charAt(0);
        if (Character.isAlphabetic(c)) {
            helper(prefix + Character.toString(c).toLowerCase(), s.substring(1), list);
            helper(prefix + Character.toString(c).toUpperCase(), s.substring(1), list);
        } else {
            helper(prefix + Character.toString(c), s.substring(1), list);
        }
    }
}
