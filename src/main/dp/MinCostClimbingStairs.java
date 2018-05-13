package main.dp;

//https://leetcode.com/problems/min-cost-climbing-stairs/description/

public class MinCostClimbingStairs{

    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }

        int min1 = cost[0];
        int min2 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int tmp  = Math.min(cost[i] + min1, cost[i] + min2);
            min1 = min2;
            min2 = tmp;
        }

        return Math.min(min2, min1);
    }
}
