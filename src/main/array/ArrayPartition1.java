package main.array;

import java.util.Arrays;

public class ArrayPartition1 {

    public int arrayPairSum(int[] nums) {
        if (nums == null) return 0;
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];

        }
        return sum;
    }
}
