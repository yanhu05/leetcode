package main.array;

import java.util.Arrays;

/*

https://leetcode.com/problems/3sum-closest/description/

Start from a simple example like all positive integers

*/

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = Integer.MAX_VALUE;
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int hi = nums.length - 1;

            while (low < hi) {
                int sum = nums[i] + nums[low] + nums[hi];
                if (sum > target) {
                    hi--;
                } else if (sum < target) {
                    low++;
                } else {
                    return sum;
                }
                int distance = Math.abs(sum - target);
                if (distance < closet) {
                    result = sum;
                    closet = distance;
                }
            }
        }
        return result;
    }
}
