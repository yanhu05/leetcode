package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {

    @Test
    void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        assertEquals(3, new FourSum().fourSum(nums, 0).size());

        int[] nums1 = {0, 0, 0, 0};
        assertEquals(1, new FourSum().fourSum(nums1, 0).size());
    }
}