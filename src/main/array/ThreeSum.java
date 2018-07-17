package main.array;

/*

https://leetcode.com/problems/3sum/description/


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int hi = nums.length - 1;
            int target = -nums[i];
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            while (low < hi) {
                if (low > i + 1 && nums[low] == nums[low - 1]) {
                    low++;
                    continue;
                }
                int sum = nums[low] + nums[hi];
                if (sum < target) {
                    low++;
                } else if (sum > target) {
                    hi--;
                } else {
                    List<Integer> _list = new ArrayList<>();
                    _list.add(nums[i]);
                    _list.add(nums[low]);
                    _list.add(nums[hi]);
                    list.add(_list);
                    hi--;
                    low++;
                }
            }
        }

        return list;
    }
}
