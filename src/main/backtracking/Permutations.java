package main.backtracking;
/*

https://leetcode.com/problems/permutations/description/

 */
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) {
            return list;
        }
        boolean[] visited = new boolean[nums.length];
        backtrack(0, visited, new ArrayList<Integer>(), nums);
        return list;
    }


    private void backtrack(int level, boolean[] visited, List<Integer> _list, int[] nums) {
        if (level == nums.length) {
            list.add(new ArrayList<>(_list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                _list.add(nums[i]);
                backtrack(level + 1, visited, _list, nums);
                visited[i] = false;
                _list.remove(_list.size() - 1);
            }
        }
    }
}
