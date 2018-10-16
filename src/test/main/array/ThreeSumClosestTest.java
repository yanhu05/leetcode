package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    @Test
    void threeSumClosest() {
        int[] nums = {-1, 2, 1, -4};
        assertEquals(2, new ThreeSumClosest().threeSumClosest(nums, 1));

    }
}