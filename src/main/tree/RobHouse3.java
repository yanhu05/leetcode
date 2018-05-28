package main.tree;

public class RobHouse3 {

    public int rob(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int[] leftMax = helper(node.left);
        int[] rightMax = helper(node.right);
        int robMax = Math.max(leftMax[0] + rightMax[0], Math.max(leftMax[0] + rightMax[1], leftMax[1] + rightMax[0]));
        int notRobMax = leftMax[1] + rightMax[1];

        return Math.max(robMax, notRobMax + node.val);
    }

    int[] helper(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        if (node.left == null && node.right == null) {
            return new int[]{node.val, 0};
        }

        int[] leftMax = helper(node.left);
        int[] rightMax = helper(node.right);

        int robMax = Math.max(leftMax[0] + rightMax[0], Math.max(leftMax[0] + rightMax[1], leftMax[1] + rightMax[0]));

        int notRobMax = leftMax[1] + rightMax[1];

        return new int[]{notRobMax + node.val, Math.max(robMax,notRobMax)};
    }

}



