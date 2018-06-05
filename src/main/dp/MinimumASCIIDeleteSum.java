package main.dp;

public class MinimumASCIIDeleteSum {

    public int minimumDeleteSum(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return 0;
        }
        int rowLen = s1.length();
        int colLen = s2.length();
        int[][] dp = new int[rowLen + 1][colLen + 1];

        for (int i = 0; i < rowLen; i++) {
            dp[i + 1][0] = s1.charAt(i) + dp[i][0];
        }

        for (int j = 0; j < colLen; j++) {
            dp[0][j + 1] = s2.charAt(j) + dp[0][j];
        }


        for (int i = 1; i <= rowLen; i++) {
            for (int j = 1; j <= colLen; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i][j - 1] + s2.charAt(j - 1), dp[i - 1][j] + s1.charAt(i - 1));
                }
            }
        }
        return dp[rowLen][colLen];
    }
}
