package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetSumTest {

    @Test
    void findTargetSumWays() {
        TargetSum m = new TargetSum();
        int[] nums = {1,1,1,1,1};
        assertEquals(5 , m.findTargetSumWays(nums, 3));
    }
}