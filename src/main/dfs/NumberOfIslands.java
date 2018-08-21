package main.dfs;


/*

https://leetcode.com/problems/number-of-islands/description/

Flood fill

*/

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //if (grid[i][j] == '0' || seen[i][j]) continue;
                //dfs(i, j, grid, seen);
                if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
                    bfs(i, j, grid);
                    cnt++;
                }

            }
        }
        return cnt;
    }

    private void dfs(int i, int j, char[][] grid, boolean[][] seen) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || seen[i][j] || grid[i][j] == '0') return;
        seen[i][j] = true; // optimization:  grid[i][j] = '0' space from O(n^2) to  O(n);
        dfs(i - 1, j, grid, seen);
        dfs(i + 1, j, grid, seen);
        dfs(i, j - 1, grid, seen);
        dfs(i, j + 1, grid, seen);
    }

    private void bfs(int i, int j, char[][] grid) {
        Position pos = new Position(i, j);
        Queue<Position> q = new LinkedList();
        q.offer(pos);
        int rowNums = grid.length;
        int colNums = grid[0].length;
        while (!q.isEmpty()) {
            Position p = q.poll();
            grid[p.row][p.col] = '0';

            i = p.row - 1;
            j = p.col;

            //top
            if (i >= 0 && j >= 0 && i < rowNums && j < colNums && grid[i][j] == '1') {
                q.offer(new Position(i, j));
            }

            i = p.row + 1;

            //bottom
            if (i >= 0 && j >= 0 && i < rowNums && j < colNums && grid[i][j] == '1') {
                q.offer(new Position(i, j));
            }


            i = p.row;
            j = p.col - 1;

            //left
            if (i >= 0 && j >= 0 && i < rowNums && j < colNums && grid[i][j] == '1') {
                q.offer(new Position(i, j));
            }

            j = p.col + 1;

            //right
            if (i >= 0 && j >= 0 && i < rowNums && j < colNums && grid[i][j] == '1') {
                q.offer(new Position(i, j));
            }

        }

    }

}

class Position {
    int row;
    int col;

    Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
}