package main.dp;

//https://leetcode.com/problems/arithmetic-slices/description/

public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] input) {
        if (input == null || input.length < 3) {
            return 0;
        }
        int[] dp = new int[input.length];
        for (int i = 2; i < input.length; i++) {
            if (isConsecutive(input, i)) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int total = 0;
        for (int i = 0; i < dp.length; i++) {
            total += dp[i];
        }
        return total;
    }

    private boolean isConsecutive(int[] input, int start) {
        return input[start] - input[start - 1] == input[start - 1] - input[start - 2];
    }
}
