package main.tree;

public class InsertBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        insert(root, val);
        return root;
    }

    private void insert(TreeNode root, int val) {
        if (root == null) return;
        TreeNode node = new TreeNode(val);
        if (root.left == null && val < root.val) {
            root.left = node;
            return;
        }
        if (root.right == null && val > root.val) {
            root.right = node;
            return;
        }

        if (root.left == null && root.right == null) {
            if (val < root.val) {
                root.left = node;
            } else {
                root.right = node;
            }
            return;
        }

        if (root.left != null && val < root.val) {
            insert(root.left, val);
        } else if (root.right != null && val > root.val) {
            insert(root.right, val);
        }
    }
}
