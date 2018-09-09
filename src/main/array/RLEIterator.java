package main.array;
/*

https://leetcode.com/problems/rle-iterator/description/

 */

public class RLEIterator {
    int[] nums;
    int lastIndex = 0;

    public RLEIterator(int[] A) {
        nums = A;
    }

    public int next(int n) {
        if (lastIndex >= nums.length) return -1;
        int num = nums[lastIndex];
        while (n > num) {
            n = n - num;
            lastIndex += 2;
            if (lastIndex >= nums.length) return -1;
            num = nums[lastIndex];
        }

        nums[lastIndex] = num - n;
        return nums[lastIndex + 1];
    }

}
