package main.tree;

public class TrimBinarySearchTree {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }

        if (root.val == L) {
            root.left = null;
            root.right = trimBST(root.right, L, R);

        } else if (root.val == R) {
            root.right = null;
            root.left = trimBST(root.left, L, R);

        } else if (root.val < L) {
            root = root.right;
            root = trimBST(root, L, R);
        } else if (root.val > R) {
            root = root.left;
            root = trimBST(root, L, R);
        } else {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
        }

        return root;
    }
}
