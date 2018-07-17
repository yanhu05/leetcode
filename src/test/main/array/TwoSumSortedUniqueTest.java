package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSortedUniqueTest {

    @Test
    void twoSum() {
        int[] nums = {-1, -1, -1, -1, 0, 1, 2, 2};
        assertEquals(1, new TwoSumSortedUnique().twoSum(nums, -2).size());
    }
}