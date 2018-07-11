package main.array;

/*

https://leetcode.com/problems/product-of-array-except-self/description/

Input:  [1,2,3,4]
Output: [24,12,8,6]

Thought process:  Start from answer
To get [24,12,8,6], we need to have something like

[1, 1, 2,6]
[24,12,4,1]

The first array stores running products right before nums[i].
The second array stores running products right after nums[i].

 */
public class ProductArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        if (nums == null) return new int[0];
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            res[i + 1] = nums[i] * res[i];
        }

        int tmp = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * tmp;
            tmp *= nums[i];
        }
        return res;
    }
}
