package main.tree;

public class InsertBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return root;
        TreeNode node = new TreeNode(val);
        insert(root, node);
        return root;
    }

    private void insert(TreeNode root, TreeNode node) {
        int val = node.val;
        if (root.left == null && val < root.val) {
            root.left = node;
            return;
        }
        if (root.right == null && val > root.val) {
            root.right = node;
            return;
        }

        if (root.left != null && val < root.val) {
            insert(root.left, node);
        } else if (root.right != null && val > root.val) {
            insert(root.right, node);
        }
    }
}
