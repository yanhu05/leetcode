package main.array;

import java.util.Arrays;

public class MinimumMovesEqualArrayElements {

    public int minMoves2(int[] nums) {
        if (nums == null) return 0;

        Arrays.sort(nums);
        int moves = 0;
        int mid = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (i != mid) {
                moves += Math.abs(nums[i] - nums[mid]);
            }
        }
        return moves;
    }
}
