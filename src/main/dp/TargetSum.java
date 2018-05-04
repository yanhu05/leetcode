package main.dp;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    private Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
    
    public int findTargetSumWays(int[] nums, int S) {
		if(nums == null || nums.length ==0) return 0;
		
		return helper(nums, 0, 0, S);
	}

	private int helper(int[] nums, int start, int sum, int target) {
		
		if(start == nums.length){
			return sum == target? 1: 0;
		}
	
				
		int ways = helper(nums, start + 1, sum - nums[start], target) + helper(nums, start + 1, sum + nums[start], target);

		return ways;

	}
}
