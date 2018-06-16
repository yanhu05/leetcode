package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPartition1Test {

    @Test
    void arrayPairSum() {
        int[] nums = {1, 4, 3, 2};
        assertEquals(4, new ArrayPartition1().arrayPairSum(nums));

        int[] nums1 = {-7, 6, 4, 3, 14, -15};

        assertEquals(-6, new ArrayPartition1().arrayPairSum(nums1));
    }
}