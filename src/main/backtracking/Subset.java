package main.backtracking;

/*

https://leetcode.com/problems/subsets/description/

When DFS, there is no look back. So it looks forward only.   Using boolean seen[] won't work because it would make subsequent DFS look backward
When we permutate a set, every set has the same length.  So we can use boolean seen[]


*/

import java.util.ArrayList;
import java.util.List;

public class Subset {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        list.add(new ArrayList<>());
        backtrack(nums, new ArrayList<>(), 0);
        return list;
    }

    private void backtrack(int[] nums, List<Integer> _list, int j) {
        for (int i = j; i < nums.length; i++) {
            _list.add(nums[i]);
            this.list.add(new ArrayList<>(_list));
            backtrack(nums, _list, i + 1);
            _list.remove(_list.size() - 1);

        }
    }
}
