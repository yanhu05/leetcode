package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSumTest {

    @Test
    void minFallingPathSum() {
        int[][] nums = {{-19, 57},
                {-40, -5}};
        assertEquals(-59, new MinimumFallingPathSum().minFallingPathSum(nums));
        int[][] nums1 = {{0}};
        assertEquals(0, new MinimumFallingPathSum().minFallingPathSum(nums1));

        int[][] nums2 = {{0, -17, 3, 4, 5, 6}};
        assertEquals(-17, new MinimumFallingPathSum().minFallingPathSum(nums2));
    }
}