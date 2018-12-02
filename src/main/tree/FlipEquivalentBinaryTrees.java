package main.tree;

/*

https://leetcode.com/problems/flip-equivalent-binary-trees/

 */

public class FlipEquivalentBinaryTrees {

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        TreeNode left1 = root1.left;
        TreeNode left2 = root2.left;

        TreeNode right1 = root1.right;
        TreeNode right2 = root2.right;

        if (left1 != null && left2 != null && left1.val == left2.val) {
            return flipEquiv(left1, left2) && flipEquiv(right1, right2);
        }


        if (right1 != null && right2 != null && right1.val == right2.val) {
            return flipEquiv(left1, left2) && flipEquiv(right1, right2);
        }

        return flipEquiv(left1, right2) && flipEquiv(right1, left2);
    }
}
