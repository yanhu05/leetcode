package main.tree;

public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode tmp = root.left;
        while (tmp != null && tmp.right != null) {
            tmp = tmp.right;
        }
        if (tmp != null) {
            tmp.right = root.right;
        }
        root.right = root.left != null ? root.left : root.right;
        root.left = null;
    }
}
