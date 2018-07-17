package main.array;
/*

https://leetcode.com/problems/4sum/description/

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int j = 0; j < nums.length - 3; j++) {
            if (j > 0 && nums[j - 1] == nums[j]) continue;
            for (int i = j + 1; i < nums.length - 2; i++) {
                int low = i + 1;
                int hi = nums.length - 1;
                int _target = target - nums[j] - nums[i];
                if (i > j + 1 && nums[i - 1] == nums[i]) continue;
                while (low < hi) {
                    if (low > i + 1 && nums[low] == nums[low - 1]) {
                        low++;
                        continue;
                    }
                    int sum = nums[low] + nums[hi];
                    if (sum < _target) {
                        low++;
                    } else if (sum > _target) {
                        hi--;
                    } else {
                        List<Integer> _list = new ArrayList<>();
                        _list.add(nums[j]);
                        _list.add(nums[i]);
                        _list.add(nums[low]);
                        _list.add(nums[hi]);
                        list.add(_list);
                        hi--;
                        low++;
                    }
                }
            }
        }
        return list;
    }
}
