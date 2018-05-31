package main.tree;
//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/

public class TwoSumIV {

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        return walk(root, root, k);
    }

    private boolean walk(TreeNode root, TreeNode current, int k) {
        if (current == null) {
            return false;
        }
        int diff = k - current.val;
        boolean flag = search(root, current, diff);
        if (flag) {
            return flag;
        }
        return walk(root, current.left, k) || walk(root, current.right, k);
    }

    private boolean search(TreeNode root, TreeNode current, int diff) {
        if (root == null) {
            return false;
        }
        if (root.val == diff && root == current) {
            return true;
        }

        return search(root.left, current, diff) || search(root.right, current, diff);
    }
}
