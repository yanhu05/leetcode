package main.backtracking;

/*

https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {

    List<String> res = new ArrayList<>();
    Map<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return res;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        dfs(0, digits.length(), new ArrayList<>(), digits);
        return res;
    }

    void dfs(int index, int level, List<Character> list, String digits) {
        if (index > level - 1) {
            StringBuilder sb = new StringBuilder();
            list.forEach(c -> sb.append(c));
            res.add(sb.toString());
            return;
        }

        String str = map.get(digits.charAt(index));
        for (char c : str.toCharArray()) {
            list.add(c);
            dfs(index + 1, level, list, digits);
            list.remove(list.size() - 1);
        }
    }
}
