package main.dp;

//https://leetcode.com/problems/longest-increasing-subsequence/description/

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;

        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxHere = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    maxHere = Math.max(dp[j] + 1, maxHere);
                }
            }
            dp[i] = maxHere;
            max = Math.max(max, maxHere);
        }
        return max;
    }
}
