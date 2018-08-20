package main.backtracking;


/*

https://leetcode.com/problems/generate-parentheses/description/


*/



import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) return list;
        helper("", 0, n);
        return list;
    }

    private void helper(String prefix, int depth, int n) {
        if (depth == n * 2) {
            list.add(prefix);
            return;
        }
        int leftPerenCtn = 0;
        int rightPerenCtn = 0;
        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) == '(') {
                leftPerenCtn++;
            } else {
                rightPerenCtn++;
            }
        }
        if (leftPerenCtn < n) {
            helper(prefix + "(", depth + 1, n);
        }

        if (rightPerenCtn < n && rightPerenCtn < leftPerenCtn) {
            helper(prefix + ")", depth + 1, n);
        }
    }
}
