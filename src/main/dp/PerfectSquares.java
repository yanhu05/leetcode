package main.dp;

/*

https://leetcode.com/problems/perfect-squares/description/
0 1 2 3 4 5 6 7 8 9 10 11 12
0 1 2 3 1 2 3 4 2 1  2  3  4

Like the coin change problem

https://leetcode.com/problems/coin-change/description/


 */

public class PerfectSquares {

    public int numSquares(int n) {
      /*
         This is like getting coin denominations.

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= n; i++){
            list.add(i*i);
        }
        */
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1, k = 1;
            while ((k = j * j) <= n) {
                if (k > i) {
                    break;
                }
                min = Math.min(dp[i - k] + 1, min);
                j++;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
