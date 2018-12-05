package main.stack;

import java.util.*;

/*

https://leetcode.com/problems/next-greater-element-ii/

 */
public class NextGreaterElement2 {

    public int[] nextGreaterElements(int[] nums) {
        if (nums == null) return new int[0];
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Stack<Integer> dStack = new Stack();
        Stack<Integer> indexes = new Stack();

        for (int i = 0; i < nums.length * 2; i++) {
            int index = i % nums.length;
            int num = nums[index];
            while (!dStack.isEmpty() && dStack.peek() < num) {
                dStack.pop();
                res[indexes.pop()] = num;
            }
            dStack.push(num);
            indexes.push(index);

        }

        return res;
    }
}
