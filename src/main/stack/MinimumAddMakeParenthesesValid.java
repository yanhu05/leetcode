package main.stack;

import java.util.Stack;

/*


https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

 */
public class MinimumAddMakeParenthesesValid {

    public int minAddToMakeValid(String S) {
        if (S == null) return 0;
        Stack<Character> stack = new Stack();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
