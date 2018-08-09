package main.array;

/*
https://leetcode.com/problems/rotate-image/description/

 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        if (matrix == null) return;
        int head = 0;
        int tail = matrix.length - 1;
        // swap rows:  head amd tail swaps
        while (head < tail) {
            swapRows(matrix[head++], matrix[tail--]);
        }

        // swap around diagonal
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    private void swapRows(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int tmp = a[i];
            a[i] = b[i];
            b[i] = tmp;
        }
    }
}
