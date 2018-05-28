package main.tree;

public class BinaryTreePruning {

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.left != null) {
            root.left = pruneTree(root.left);
        }
        if (root.right != null) {
            root.right = pruneTree(root.right);
        }

        if (root.val == 0 && root.right == null && root.left == null) {
            root = null;
        }
        return root;
    }
}
