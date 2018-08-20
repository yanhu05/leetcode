package main.backtracking;

import java.util.*;

/*

https://leetcode.com/problems/subsets-ii/

Must sort it first
For example;  [1,2,2,1]
Without sorting it, we'd have [1, 2] and [2,1], which is incorrect
With sorting [1,1,2,2], There is no way we can we subsets like the ones above

 */
public class Subset2 {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        list.add(new ArrayList<>());
        backtrack(nums, new ArrayList<>(), 0);
        return list;
    }

    private void backtrack(int[] nums, List<Integer> _list, int j) {
        Set<Integer> seen = new HashSet<>();
        for (int i = j; i < nums.length; i++) {
            if (seen.add(nums[i])) {
                _list.add(nums[i]);
                this.list.add(new ArrayList<>(_list));
                backtrack(nums, _list, i + 1);
                _list.remove(_list.size() - 1);
            }

        }
    }
}
