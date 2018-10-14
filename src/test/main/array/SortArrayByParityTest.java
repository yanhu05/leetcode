package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    @Test
    void sortArrayByParity() {
    }

    @Test
    void totalFruit() {
        int[] nums = {1, 2, 1};
        assertEquals(3, new SortArrayByParity().totalFruit(nums));

        int[] nums1 = {0, 1, 2, 2};
        assertEquals(3, new SortArrayByParity().totalFruit(nums1));

        int[] nums2 = {1, 2, 3, 2, 2};
        assertEquals(4, new SortArrayByParity().totalFruit(nums2));

        int[] nums3 = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        assertEquals(5, new SortArrayByParity().totalFruit(nums3));
    }
}