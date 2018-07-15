package main.backtracking;

import java.util.*;

/*

https://leetcode.com/submissions/detail/163823465/


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
