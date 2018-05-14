package main.dp;

// https://leetcode.com/problems/range-sum-query-immutable/description/

public class RangeSumQuery {

    int[] sums = new int[0];

    public RangeSumQuery(int[] nums) {
        if (nums != null && nums.length > 0) {
            sums = new int[nums.length];
            sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sums[i] = nums[i] + sums[i - 1];
            }
        }

    }

    public int sumRange(int i, int j) {
        if (i < 0 || j > sums.length - 1) {
            return 0;
        }
        return i > 0 ? sums[j] - sums[i - 1] : sums[j];
    }
}
