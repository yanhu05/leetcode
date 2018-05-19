package main.dp;

public class RobHouse {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int rob = nums[0];
        int notRob = 0;
        for(int i = 1; i< nums.length ; i++){
            int tmp = rob;
            rob = nums[i] + notRob;
            notRob = Math.max(tmp, notRob);
        }

        return Math.max(rob, notRob);
    }

}
