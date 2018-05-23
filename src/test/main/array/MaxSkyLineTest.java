package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSkyLineTest {

    @Test
    void maxIncreaseKeepingSkyline() {
        int[][] grid = {
                {3, 0, 8, 4}, 
              {2, 4, 5, 7},
              {9, 2, 6, 3},
              {0, 3, 1, 0} 
        };

        assertEquals(35, new MaxSkyLine().maxIncreaseKeepingSkyline(grid));

    }
}