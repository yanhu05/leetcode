package main.array;
/*

https://leetcode.com/problems/kth-largest-element-in-an-array/description/

Also we can use Quick Select
https://en.wikipedia.org/wiki/Quickselect

 */

import java.util.Arrays;

public class KthLargestElementArray {

    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int cnt = 0;
        int i;
        for (i = nums.length - 1; i >= 0; i--) {
            cnt++;
            if (cnt == k) break;
        }
        return nums[i];
    }
}
