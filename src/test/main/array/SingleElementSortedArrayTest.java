package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleElementSortedArrayTest {

    @Test
    void singleNonDuplicate() {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        assertEquals(2, new SingleElementSortedArray().singleNonDuplicate(nums));

        int[] nums1 = {3, 3, 7, 7, 10, 11, 11};
        assertEquals(10, new SingleElementSortedArray().singleNonDuplicate(nums1));
    }
}