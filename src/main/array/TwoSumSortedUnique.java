package main.array;

import java.util.ArrayList;
import java.util.List;

public class TwoSumSortedUnique {


    public List<List<Integer>> twoSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0, j = nums.length - 1; i < j; ) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int sum = nums[j] + nums[i];
            if (sum == target) {
                List<Integer> _list = new ArrayList<>();
                _list.add(nums[i]);
                _list.add(nums[j]);
                i++;
                j--;
                list.add(_list);
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }

        }
        return list;
    }
}
