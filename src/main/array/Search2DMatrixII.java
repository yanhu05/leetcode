package main.array;

/*

https://leetcode.com/problems/search-a-2d-matrix-ii/description/

Thought process
Do not get hung up on Binary Search just because it is sorted.
Start from the end of the first row.  If target > that number, discard the entire row because all other numbers are smaller.
If target < that number. discard the entire column for the same reason.
Narrow it down until we find it or the pointer falls out of matrix.

*/

public class Search2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rowNum = 0;
        int colNum = matrix[0].length - 1;

        while (rowNum <= matrix.length - 1 && colNum >= 0) {
            int num = matrix[rowNum][colNum];
            if (target > num) {
                rowNum++;
            } else if (target < num) {
                colNum--;
            } else {
                return true;
            }
        }
        return false;

    }
}
