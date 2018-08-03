package main.array;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rowNums = matrix.length;
        int colNums = matrix[0].length;
        
        for (int i = 0; i < rowNums; i++) {
            if (target > matrix[i][colNums - 1]) {
                continue;
            }
            int low = 0;
            int hi = colNums - 1;
            while (low <= hi) {
                int mid = low + (hi - low) / 2;
                if (target == matrix[i][mid]) {
                    return true;
                } else if (target > matrix[i][mid]) {
                    low = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            break;
        }
        return false;
    }

}
