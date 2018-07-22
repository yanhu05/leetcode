package main.math;

/*

https://leetcode.com/problems/happy-number/description/

If we see it again, it is a cycle.  Key is to find the cycle if any.

Best is to use Cycle Detection @ https://en.wikipedia.org/wiki/Cycle_detection

*/


import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();
        int num = n;
        while (seen.add(num)) {
            num = helper(num);
            if (num == 1) return true;
        }
        return false;
    }


    public boolean isHappyCycleDetection(int n) {
        int slow = n, fast = n;
        do {
            if (slow == 1 || fast == 1) return true;
            slow = helper(slow);
            fast = (helper(helper(fast)));
        } while (slow != fast);

        return false;
    }

    private int helper(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
}
