package main.array;

/*

https://leetcode.com/problems/minimum-falling-path-sum/description/

This is a dp problem

 */
public class MinimumFallingPathSum {

    public int minFallingPathSum(int[][] nums) {
        if (nums == null) return 0;
        int retVal = Integer.MAX_VALUE;
        int rows = nums.length;
        int cols = nums[0].length;
        if (cols == 1) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += nums[i][0];
            }
            return sum;
        }

        int[] tmpRow = new int[cols];
        int[] resultRow = new int[cols];
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < cols; j++) {
                int num = nums[i][j];
                if (j > 0 && j < cols - 1) {
                    resultRow[j] = num + Math.min(tmpRow[j - 1], Math.min(tmpRow[j], tmpRow[j + 1]));
                } else if (j == 0) {
                    resultRow[j] = num + Math.min(tmpRow[j], tmpRow[j + 1]);
                } else {
                    resultRow[j] = num + Math.min(tmpRow[j], tmpRow[j - 1]);
                }
            }
            for (int k = 0; k < cols; k++) {
                tmpRow[k] = resultRow[k];
            }
        }

        for (int num : resultRow) {
            retVal = Math.min(num, retVal);
        }
        return retVal;
    }
}
