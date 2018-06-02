package main.dp;

public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
            }
        }

        for (int col = 2; col < len; col++) {
            int j = col;
            for (int row = 0; row < len - col; row++) {
                if (s.charAt(row) == s.charAt(j)) {
                    dp[row][j] = dp[row + 1][j - 1];
                }
                j++;
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (dp[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
