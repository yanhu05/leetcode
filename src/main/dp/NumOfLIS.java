package main.dp;

//https://leetcode.com/problems/number-of-longest-increasing-subsequence/description/


public class NumOfLIS {
    public int findNumberOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;


        int max = 1;
        for (int i = 1; i < len; i++) {
            int maxHere = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    maxHere = Math.max(dp[j] + 1, maxHere);
                }
            }
            dp[i] = maxHere;
            max = Math.max(max, maxHere);
        }


        int[] cnt = new int[len];
        cnt[0] = 1;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[j] + 1 == dp[i]) {
                        cnt[i] += cnt[j];
                    }
                }
            }
            if (cnt[i] == 0) {
                cnt[i] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (max == dp[i]) {
                count += cnt[i];
            }
        }

        return count;
    }
}
