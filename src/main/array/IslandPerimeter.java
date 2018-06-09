package main.array;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int p = 0;
        int colLen = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < colLen; j++) {
                if (grid[i][j] == 0) continue;
                // check left
                if (j == 0) {
                    p++;
                } else if (grid[i][j - 1] == 0) {
                    p++;
                }

                // check right
                if (j == colLen - 1) {
                    p++;
                } else if (grid[i][j + 1] == 0) {
                    p++;
                }

                // check up
                if (i == 0) {
                    p++;
                } else if (grid[i - 1][j] == 0) {
                    p++;
                }
                // check bottom
                if (i == grid.length - 1) {
                    p++;
                } else if (grid[i + 1][j] == 0) {
                    p++;
                }
            }
        }
        return p;
    }

}
