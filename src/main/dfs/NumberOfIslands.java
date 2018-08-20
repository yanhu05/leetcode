package main.dfs;


/*

https://leetcode.com/problems/number-of-islands/description/

Flood fill

*/

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0' || seen[i][j]) continue;
                dfs(i, j, grid, seen);
                cnt++;
            }
        }
        return cnt;
    }

    private void dfs(int i, int j, char[][] grid, boolean[][] seen) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || seen[i][j] || grid[i][j] == '0') return;
        seen[i][j] = true;
        dfs(i - 1, j, grid, seen);
        dfs(i + 1, j, grid, seen);
        dfs(i, j - 1, grid, seen);
        dfs(i, j + 1, grid, seen);
    }
}
