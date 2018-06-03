package main.dp;

public class LongestCommonSubstring {

    public int longestCommonSubstring(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return 0;
        }
        int rowLen = s1.length();
        int colLen = s2.length();
        int[][] dp = new int[rowLen][colLen];
        int max = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i > 0 && j > 0) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = 1;
                    }
                    max = Math.max(max, dp[i][j]);
                }

            }

        }

        return max;
    }
}
