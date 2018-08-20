package main.twopinters;

import java.util.Stack;

/*

https://leetcode.com/problems/backspace-string-compare/description/

 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        return helper(S).equals(helper(T));
    }

    private String helper(String str) {
        char[] s = str.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != '#') {
                stack.push(s[i]);
                continue;
            }
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

}
