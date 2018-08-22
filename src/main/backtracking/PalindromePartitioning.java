package main.backtracking;

import java.util.ArrayList;
import java.util.List;


/*

https://leetcode.com/problems/palindrome-partitioning/description/


 */
public class PalindromePartitioning {
    List<List<String>> list = new ArrayList<>();

    public List<List<String>> partition(String s) {
        if (s == null || s.length() == 0) return this.list;
        dfs(0, new ArrayList<>(), s);
        return this.list;
    }

    private void dfs(int level, List<String> _list, String s) {
        if (level == s.length()) {
            list.add(new ArrayList<>(_list));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = level; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (isPalindrome(sb)) {
                _list.add(sb.toString());
                dfs(i + 1, _list, s);
                _list.remove(_list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(StringBuilder sb) {
        if (sb.length() == 1) return true;
        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i++) != sb.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
