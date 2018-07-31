package main.dp;

import java.util.HashMap;
import java.util.Map;

/*

https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/description/


    1 2 3 4 5 6 7 8

1
2
3     3
4       3
5       4 3
6         3 3
7         4 3 3
8           5 3 3

 */
public class LongestFibonacciSubsequence {

    public int lenLongestFibSubseq(int[] A) {
        int[][] dp = new int[A.length][A.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], i);
        }
        int max = 0;
        for (int i = 2; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                int k = map.getOrDefault(A[i] - A[j], -1);
                if (k > -1 && k < j) {
                    if (dp[j][k] == 0) {
                        dp[i][j] = 3;
                    } else {
                        dp[i][j] = dp[j][k] + 1;
                    }
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
