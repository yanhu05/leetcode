package main.dp;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public int climbStairsMemoization(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int step1;
        if (cache.containsKey(n - 1)) {
            step1 = cache.get(n - 1);
        } else {
            step1 = climbStairsMemoization(n - 1);
            cache.put(n - 1, step1);
        }

        int step2;
        if (cache.containsKey(n - 2)) {
            step2 = cache.get(n - 2);
        } else {
            step2 = climbStairsMemoization(n - 2);
            cache.put(n - 2, step2);
        }

        return step1 + step2;
    }


    int step1 = 1;
    int step2 = 1;

    public int climbStairsTabulation(int n) {
        for (int i = 2; i <= n; i++) {
            int tmp = step2;
            step2 = step1 + step2;
            step1 = tmp;
        }
        return step2;
    }

}
