package main.design;

import java.util.*;

/*

https://leetcode.com/problems/maximum-frequency-stack/description/

 */
public class MaximumFrequencyStack {
    Stack<Integer> stack = new Stack();
    Stack<Integer> tmpStack = new Stack<>();
    Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Set<Integer>> freqMap = new HashMap<>();
    int max = 0;

    public MaximumFrequencyStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (map.containsKey(x)) {
            map.put(x, map.get(x) + 1);
        } else {
            map.put(x, 1);
        }
        int freq = map.get(x);
        if (freqMap.containsKey(freq)) {
            Set<Integer> set = freqMap.get(freq);
            set.add(x);
        } else {
            Set<Integer> set = new HashSet<>();
            set.add(x);
            freqMap.put(freq, set);
        }

        max = Math.max(max, map.get(x));
    }

    public int pop() {
        int retVal = 0;
        while (!stack.isEmpty()) {
            int num = stack.peek();
            if (map.get(num) == max) {
                int freq = map.get(num);
                Set<Integer> set = freqMap.get(freq);
                set.remove(num);
                if (set.size() == 0) {
                    max--;
                }
                --freq;
                if (freq > 0) {
                    freqMap.get(freq).add(num);
                }
                map.put(num, freq);
                retVal = stack.pop();
                break;
            } else {
                tmpStack.push(stack.pop());
            }

        }

        while (!tmpStack.isEmpty()) {
            stack.push(tmpStack.pop());
        }

        return retVal;
    }
}
