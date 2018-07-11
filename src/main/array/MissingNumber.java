package main.array;

/*

https://leetcode.com/problems/missing-number/description/

 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        if (nums == null) return -1;
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return total - sum;
    }


    // needs O(n) extra space
    public int missingNumber1(int[] nums) {
        if (nums == null) return -1;
        int[] map = new int[nums.length + 1];

        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            map[nums[i]] = nums[i];
        }

        for (int i = 0; i < map.length; i++) {
            if (map[i] == -1) {
                return i;
            }
        }
        return -1;
    }
}
