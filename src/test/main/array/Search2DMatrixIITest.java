package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixIITest {

    @Test
    void searchMatrix() {
        int[][] nums = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        assertEquals(false, new Search2DMatrixII().searchMatrix(nums, -90));
        assertEquals(true, new Search2DMatrixII().searchMatrix(nums, 30));
        assertEquals(false, new Search2DMatrixII().searchMatrix(nums, 25));


        int[][] nums1 = {
                {15},
                {19},
                {22},
                {24},
                {30}
        };

        assertEquals(false, new Search2DMatrixII().searchMatrix(nums1, 25));
    }
}