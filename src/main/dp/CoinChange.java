package main.dp;

import java.util.Arrays;

/*

https://leetcode.com/problems/coin-change/description/

0 1 2 3 4 5 6 7 8 9 10 11 12
0 1 2 3 1 2 3 4 2 1  2  3  4

 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] > i) {
                    continue;
                }
                int val = i - coins[j];
                if (dp[val] != -1) {
                    min = Math.min(min, dp[val] + 1);
                }
            }
            if (min < Integer.MAX_VALUE) {
                dp[i] = min;
            }
        }
        return dp[amount];
    }
}
