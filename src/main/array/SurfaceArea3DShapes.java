package main.array;

public class SurfaceArea3DShapes {

    public int surfaceArea(int[][] grid) {
        int area = 0;
        int rowNum = grid.length;
        int colNum = grid[0].length;
        for (int i = 0; i < rowNum; i++) {
            int rowSum = 0;
            for (int j = 0; j < colNum; j++) {
                int num = grid[i][j];
                if (num == 0) continue;
                int total = 2; // top and bottom are always 1+1
                // check left
                if (j - 1 < 0) {
                    total += grid[i][j];
                } else {
                    int left = grid[i][j - 1];
                    if (num > left) {
                        total += num - left;
                    }

                }
                // right
                if (j + 1 == colNum) {
                    total += grid[i][j];
                } else {
                    int right = grid[i][j + 1];
                    if (num > right) {
                        total += num - right;
                    }
                }
                // top
                if (i - 1 < 0) {
                    total += grid[i][j];
                } else {
                    int top = grid[i - 1][j];
                    if (num > top) {
                        total += num - top;
                    }
                }
                // bottom
                if (i + 1 == rowNum) {
                    total += grid[i][j];
                } else {
                    int bottom = grid[i + 1][j];
                    if (num > bottom) {
                        total += num - bottom;
                    }
                }
                rowSum += total;
            }
            area += rowSum;
        }

        return area;
    }
}
