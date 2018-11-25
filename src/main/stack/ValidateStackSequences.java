package main.stack;
/*

https://leetcode.com/problems/validate-stack-sequences/

 */

import java.util.Stack;

public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0 && popped.length == 0) return true;
        Stack<Integer> pushes = new Stack<>();
        int i = 0;
        for (int num : popped) {
            if (i == pushed.length && pushes.peek() != num) {
                return false;
            }
            if (!pushes.isEmpty() && pushes.peek() == num) {
                pushes.pop();
                continue;
            }
            while (i < pushed.length) {
                if (pushed[i] != num) {
                    pushes.push(pushed[i]);
                    i++;
                    continue;
                }
                i++;
                break;
            }
        }
        return true;
    }
}
