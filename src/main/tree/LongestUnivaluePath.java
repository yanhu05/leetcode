package main.tree;
/*

https://leetcode.com/problems/longest-univalue-path/description/


 */


public class LongestUnivaluePath {
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }


    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);

        if (root.left != null && root.val == root.left.val) {
            leftSum += 1;
        } else {
            leftSum = 0;   //  reset
        }

        if (root.right != null && root.val == root.right.val) {
            rightSum += 1;
        } else {
            rightSum = 0; // reset
        }

        max = Math.max(max, leftSum + rightSum);
        return Math.max(leftSum, rightSum);
        // Must pick the longer one because an inverse Y shape means 2 paths for example root = 4, root.left = 4, root.right = 4, root.right.right = 4.
        // In this case, the path is root -> root.right -> root.right.right
    }
}
