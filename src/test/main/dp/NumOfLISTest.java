package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumOfLISTest {

    @Test
    void findNumberOfLIS() {
        int[] nums = {1, 3, 5, 4, 7};
        assertEquals(2, new NumOfLIS().findNumberOfLIS(nums));

        int[] nums1 = {2, 2, 2, 2, 2};
        assertEquals(5, new NumOfLIS().findNumberOfLIS(nums1));

        int[] nums2 = {1, 2, 4, 3, 5, 4, 7, 2};
        assertEquals(3, new NumOfLIS().findNumberOfLIS(nums2));
    }
}