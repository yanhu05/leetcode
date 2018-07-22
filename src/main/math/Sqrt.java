package main.math;

/*

https://leetcode.com/problems/sqrtx/description/

Thought process
When sorted, must try Binary search first

 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0) return 0;
        int l = 1;
        int h = x;
        while (l <= h) {
            long mid = l + (h - l) / 2;
            long tmp = mid * mid;
            if (tmp == x) return (int) mid;
            else if (tmp > x) {
                h = (int) mid - 1;
            } else {
                l = (int) mid + 1;
            }
        }
        return l--;
    }


    public int mySqrtAccepted(int x) {
        if (x == 0) return 0;
        int root = 1;
        for (long i = 1; i * i <= x; i++) {
            root = (int) i;
        }

        return root;
    }
}
