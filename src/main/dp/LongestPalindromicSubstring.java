package main.dp;

//https://leetcode.com/problems/longest-palindromic-substring/description/

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        int[][] dp = new int[len][len];
        boolean[][] dpBoolean = new boolean[len][len];


        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
            dpBoolean[i][i] = true;
        }


        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dpBoolean[i][i + 1] = true;
            }
        }

        for (int col = 2; col < len; col++) {
            int j = col;
            for (int row = 0; row < len - col; row++) {
                if (s.charAt(row) == s.charAt(j)) {
                    dpBoolean[row][j] = dpBoolean[row + 1][j - 1];
                }
                j++;
            }
        }

        for (int col = 1; col < len; col++) {
            int j = col;
            for (int row = 0; row < len - col; row++) {
                if (s.charAt(row) == s.charAt(j)) {
                    if (col < 2 || dpBoolean[row + 1][j - 1]) {
                        dp[row][j] = 2 + dp[row + 1][j - 1];
                    } else {
                        dp[row][j] = Math.max(dp[row][j - 1], dp[row + 1][j]);
                    }
                } else {
                    dp[row][j] = Math.max(dp[row][j - 1], dp[row + 1][j]);
                }
                j++;
            }
        }
        int max = dp[0][len - 1];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (dp[i][j] == max) {
                    int start = 1 + j - max;
                    int end = j + 1;
                    return s.substring(start, end);
                }
            }
        }
        return "";
    }
}
