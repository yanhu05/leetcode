package main.tree;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/find-bottom-left-tree-value/description/

public class FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        TreeNode firstNode = root;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (i == 0) {
                    firstNode = node;
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

        }
        return firstNode.val;
    }
}
