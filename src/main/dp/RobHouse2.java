package main.dp;

public class RobHouse2 {
    public int rob(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int rob = nums[0];
        int notRob = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int tmp = rob;
            rob = nums[i] + notRob;
            notRob = Math.max(tmp, notRob);
        }

        int rob1Max = Math.max(rob, notRob);

        rob = nums[1];
        notRob = 0;
        for (int i = 2; i < nums.length; i++) {
            int tmp = rob;
            rob = nums[i] + notRob;
            notRob = Math.max(tmp, notRob);
        }

        int rob2Max = Math.max(rob, notRob);

        return Math.max(rob1Max, rob2Max);
    }
}
