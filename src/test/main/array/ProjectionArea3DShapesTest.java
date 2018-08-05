package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectionArea3DShapesTest {

    @Test
    void projectionArea() {
        int[][] grid = {{2}};

        assertEquals(5, new ProjectionArea3DShapes().projectionArea(grid));

    }
}