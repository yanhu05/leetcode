package main.dp;


import java.util.Arrays;

public class CutRod {

    public int cutRodBF(int len, int[] prices) {
        if (len == 0 || prices == null) return 0;
        int max = 0;

        for (int i = 0; i < len; i++) {
            max = Math.max(max, prices[i] + cutRodBF(len - i - 1, prices));
        }
        return max;
    }


    public int cutRodMemoization(int len, int[] prices) {
        if (len == 0 || prices == null) return 0;
        int[] mem = new int[len];
        Arrays.fill(mem, -1);

        return cutRod(mem, len, prices);
    }


    private int cutRod(int[] mem, int len, int[] prices) {
        if (len == 0) return 0;
        if (mem[len - 1] > -1) {
            return mem[len - 1];
        }

        int max = 0;

        for (int i = 0; i < len; i++) {
            max = Math.max(max, prices[i] + cutRod(mem, len - i - 1, prices));
        }
        mem[len - 1] = max;
        return max;
    }


    public int cutRodTabulation(int len, int[] prices) {
        if (len == 0 || prices == null) return 0;
        int[] dp = new int[len + 1];
        for (int i = 0; i < prices.length; i++) {
            dp[i + 1] = prices[i];
        }

        for (int i = 2; i <= len; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                max = Math.max(dp[j] + dp[i - j], max);
            }
            dp[i] = max;
        }
        return dp[len];
    }


}
