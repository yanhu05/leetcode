package main.Math;

/*

https://leetcode.com/problems/happy-number/description/

*/


import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();
        int num = n;
        while (seen.add(num)) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                num = num / 10;
                sum += Math.pow(digit, 2);
            }
            if (sum == 1) return true;
            num = sum;
        }
        return false;
    }
}
