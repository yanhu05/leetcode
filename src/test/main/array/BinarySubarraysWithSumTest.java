package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySubarraysWithSumTest {

    @Test
    void numSubarraysWithSum() {
        int[] nums = {1, 0, 1, 0, 1};
        assertEquals(4, new BinarySubarraysWithSum().numSubarraysWithSum(nums, 2));

        int[] nums1 = {0, 0, 0, 0, 0};
        assertEquals(15, new BinarySubarraysWithSum().numSubarraysWithSum(nums1, 0));
    }
}