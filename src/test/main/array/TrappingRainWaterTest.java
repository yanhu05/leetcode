package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void trap() {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, new TrappingRainWater().trap(nums));

        int[] nums1 = {4, 2, 3};

        assertEquals(1, new TrappingRainWater().trap(nums1));
    }
}