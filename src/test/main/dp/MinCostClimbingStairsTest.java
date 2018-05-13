package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    void minCostClimbingStairs() {
        MinCostClimbingStairs mccs = new MinCostClimbingStairs();
        int[] cost = {10, 15, 20};
        int minCost = mccs.minCostClimbingStairs(cost);
        assertEquals(15, minCost);
        int[] cost1 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        minCost = mccs.minCostClimbingStairs(cost1);
        assertEquals(6, minCost);
    }
}