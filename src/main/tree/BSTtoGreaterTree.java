package main.tree;


import java.util.ArrayList;
import java.util.List;

public class BSTtoGreaterTree {

    List<TreeNode> list = new ArrayList<>();

    public TreeNode convertBST(TreeNode root) {
        inOrderWalk(root);
        for (int i = list.size() - 1; i > 0; --i) {
            TreeNode node = list.get(i);
            TreeNode nextNode = list.get(i - 1);
            nextNode.val += node.val;
        }
        return root;
    }


    private void inOrderWalk(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderWalk(node.left);
        list.add(node);
        inOrderWalk(node.right);
    }


    public TreeNode convertBSTRecursion(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode right = convertBSTRecursion(root.right);
        TreeNode rightLeft = root.right != null ? convertBSTRecursion(root.right.left) : null;
        if (right != null) {
            root.val += right.val;
        }
        if (rightLeft != null) {
            root.val += rightLeft.val;
        }
        TreeNode left = convertBSTRecursion(root.left);
        if (left != null) {
            left.val += root.val;
        }

        return root;
    }
}
