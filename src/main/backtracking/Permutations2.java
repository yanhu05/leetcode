package main.backtracking;
/*

https://leetcode.com/problems/permutations-ii/description/

 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations2 {
    List<List<Integer>> myList = new ArrayList<>();
    int[] numbers = new int[0];
    int len = 0;

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null) return myList;
        this.len = nums.length;
        this.numbers = nums;
        boolean[] visited = new boolean[len];
        helper(0, visited, new ArrayList<>());
        return myList;
    }

    private void helper(int depth, boolean[] visited, List<Integer> list) {
        if (depth == this.len && list.size() == this.len) {
            myList.add(new ArrayList<>(list));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (!visited[i] && set.add(this.numbers[i])) {
                visited[i] = true;
                list.add(this.numbers[i]);
                helper(depth + 1, visited, list);
                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
