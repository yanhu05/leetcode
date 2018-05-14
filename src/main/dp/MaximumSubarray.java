package main.dp;

// https://leetcode.com/problems/maximum-subarray/description/

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxHere = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tmp = maxHere + nums[i];
            if (tmp > nums[i]) {
                maxHere = tmp;
            } else {
                maxHere = nums[i];
            }
            maxSum = Math.max(maxSum, maxHere);
        }
        return maxSum;
    }

}
