package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAreaRectangleTest {

    @Test
    void minAreaRect() {
        int[][] points = {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}};

        assertEquals(4, new MinimumAreaRectangle().minAreaRect(points));

        int[][] points1 = {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {4, 1}, {4, 3}};

        assertEquals(2, new MinimumAreaRectangle().minAreaRect(points1));
    }
}