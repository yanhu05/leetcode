package main.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    List<List<Integer>> mylist = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return mylist;
        helper(root, new ArrayList<Integer>(), sum);
        return mylist;
    }

    void helper(TreeNode node, List<Integer> list, int sum) {
        list.add(node.val);
        if (node.left == null && node.right == null) {
            int _sum = 0;
            for (int i : list) {
                _sum += i;
            }
            if (sum == _sum) {
                mylist.add(new ArrayList<>(list));
            }
            return;
        }

        if (node.left != null) {
            helper(node.left, list, sum);
            list.remove(list.size() - 1);
        }
        if (node.right != null) {
            helper(node.right, list, sum);
            list.remove(list.size() - 1);
        }
    }
}
