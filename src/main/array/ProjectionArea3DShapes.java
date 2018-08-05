package main.array;

/*

https://leetcode.com/problems/projection-area-of-3d-shapes/solution/

 */
public class ProjectionArea3DShapes {

    public int projectionArea(int[][] grid) {
        if (grid == null) return -1;
        int rowNums = grid.length;
        int colNUms = grid[0].length;

        int top = 0;
        int front = 0;
        int side = 0;

        for (int i = 0; i < rowNums; i++) {
            int max = 0;
            int max1 = 0;
            for (int j = 0; j < colNUms; j++) {
                if (grid[i][j] > 0) ++top;
                max = Math.max(grid[i][j], max);
                max1 = Math.max(grid[j][i], max1);
            }
            side += max;
            front += max1;
        }
        return top + side + front;
    }


}
