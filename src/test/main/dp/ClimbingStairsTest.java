package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairsMemoization() {
        ClimbingStairs stairMaster = new ClimbingStairs();
        assertEquals(3, stairMaster.climbStairsMemoization(3));
    }

    @Test
    void climbStairsTabulation() {
        ClimbingStairs stairMaster = new ClimbingStairs();
        assertEquals(5, stairMaster.climbStairsTabulation(4));
    }
}