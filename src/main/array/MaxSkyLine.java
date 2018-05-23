package main.array;

//https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/

public class MaxSkyLine {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid == null) {
            return 0;
        }

        int rowLen = grid.length;
        int colLen = grid[0].length;

        int[] rowMax = new int[rowLen];
        int[] colMax = new int[colLen];

        for (int i = 0; i < rowLen; i++) {
            int max = 0;
            for (int j = 0; j < colLen; j++) {
                max = Math.max(max, grid[i][j]);
            }
            rowMax[i] = max;
        }

        for (int j = 0; j < colLen; j++) {
            int max = 0;
            for (int i = 0; i < rowLen; i++) {
                max = Math.max(max, grid[i][j]);
            }
            colMax[j] = max;
        }

        int totalSum = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                int min = Math.min(rowMax[i], colMax[j]);
                int diff = min - grid[i][j];
                if (diff > 0) {
                    totalSum += diff;
                }
            }

        }
        return totalSum;
    }
}
