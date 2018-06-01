package main.dp;
//https://leetcode.com/problems/longest-palindromic-subsequence/description/

public class LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        int[][] dp = new int[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }

        for (int col = 1; col < len; col++) {
            int j = col;
            for (int row = 0; row < len - col; row++) {
                if (s.charAt(row) == s.charAt(j))
                    dp[row][j] = 2 + dp[row + 1][j - 1];
                else {
                    dp[row][j] = Math.max(dp[row][j - 1], dp[row + 1][j]);
                }
                j++;
            }
        }
        return dp[0][len - 1];
    }
}
