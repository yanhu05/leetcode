package main.dp;

//https://leetcode.com/problems/number-of-longest-increasing-subsequence/description/


import java.util.HashSet;
import java.util.Set;

public class NumOfLIS {
    public int findNumberOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;

        Set<Integer> mySet = new HashSet();
        mySet.add(nums[0]);

        int max = 1;
        for (int i = 1; i < len; i++) {
            mySet.add(nums[i]);
            int maxHere = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    maxHere = Math.max(dp[j] + 1, maxHere);
                }
            }
            dp[i] = maxHere;
            max = Math.max(max, maxHere);

        }

        if (mySet.size() == 1) {
            return nums.length;
        }


        int count = 0;
        for (int i = 1; i < dp.length; i++) {
            if (dp[i] < max) {
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (dp[j] == (max - 1) && nums[j] < nums[i]) {
                    count++;
                }
            }

        }
        return count;
    }
}
