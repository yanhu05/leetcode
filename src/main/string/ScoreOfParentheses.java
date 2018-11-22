package main.string;

import java.util.Stack;

/*

https://leetcode.com/problems/score-of-parentheses/

Thought process
2 immediate ideas when see brackets
1: Stack
2: DFS

Split the string into S = A + B where A and B are balanced parentheses strings, and A is the smallest possible non-empty prefix of S.
For example, "(())()() " can be split into "(())" + "()()" , Then we can solve it recursively.

 */
public class ScoreOfParentheses {

    public int scoreOfParentheses(String str) {
        if (str == null) return 0;
        int score = 0;
        Stack<Character> stack = new Stack<>();
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ')') {
                stack.pop();
            } else {
                stack.push('(');
            }
            if (stack.empty()) {
                String p = str.substring(start, i + 1);
                if (p.length() == 2) {
                    score += 1;
                } else {
                    score += 2 * scoreOfParentheses(p.substring(1, p.length() - 1));

                }
                start = i + 1;
            }
        }
        return score;
    }


}
