package main.dp;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return 0;
        }
        int rowLen = s1.length();
        int colLen = s2.length();
        int[][] dp = new int[rowLen][colLen];
        int max = 0;

        if (s1.charAt(0) == s2.charAt(0)) {
            dp[0][0] = 1;
        }

        for (int i = 1; i < rowLen; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int j = 1; j < colLen; j++) {
            if (s1.charAt(0) == s2.charAt(j)) {
                dp[0][j] = 1;
            } else {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
