package main.tree;

/*

https://leetcode.com/problems/count-complete-tree-nodes/description/

Thought process : always start from the bottom and see how to arrival at the results

1:  To get the count, we need  count from  left subtree + that of right subtree + current node
2:  How to calculate if a tree is a whole tree quickly

 */
public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftH = leftHeight(root);
        int rightH = rightHeight(root);
        if (leftH == rightH) {
            return (1 << leftH) - 1;
        }
        return 1 + countNodes(root.right) + countNodes(root.left);
    }

    private int leftHeight(TreeNode root) {
        if (root == null) return 0;
        return leftHeight(root.left) + 1;
    }

    private int rightHeight(TreeNode root) {
        if (root == null) return 0;
        return rightHeight(root.right) + 1;
    }
}
