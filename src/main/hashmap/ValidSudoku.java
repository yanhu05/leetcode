package main.hashmap;

/*

https://leetcode.com/problems/valid-sudoku/description/

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> colSets = new ArrayList<>();
        List<Set<Character>> squareSets = new ArrayList<>();
        int[][] limits = {
                {2, 2},
                {2, 5},
                {2, 8},
                {5, 2},
                {5, 5},
                {5, 8},
                {8, 2},
                {8, 5},
                {8, 8}
        };


        for (int i = 0; i < 9; i++) {
            colSets.add(new HashSet<>());
            squareSets.add(new HashSet<>());
        }


        for (int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                Set<Character> squareSet = null;
                for (int k = 0; k < 9; k++) {
                    if (i <= limits[k][0] && j <= limits[k][1]) {
                        squareSet = squareSets.get(k);
                        break;
                    }
                }
                if (!rowSet.add(c) || !colSets.get(j).add(c) || !squareSet.add(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
