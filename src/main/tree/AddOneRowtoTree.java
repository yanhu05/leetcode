package main.tree;

//https://leetcode.com/problems/add-one-row-to-tree/description/

import java.util.LinkedList;
import java.util.Queue;

public class AddOneRowtoTree {

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int currentDepth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            currentDepth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (currentDepth < d - 1) {
                    if (node.left != null) {
                        q.offer(node.left);
                    }
                    if (node.right != null) {
                        q.offer(node.right);
                    }
                } else if (currentDepth == d - 1) {
                    TreeNode tmpLeft = node.left;
                    TreeNode tmpRight = node.right;
                    node.left = new TreeNode(v);
                    node.right = new TreeNode(v);
                    node.left.left = tmpLeft;
                    node.right.right = tmpRight;
                }
            }

        }
        return root;
    }

    public TreeNode addOneRowDFS(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        dfs(root, v, d, 0);
        return root;
    }

    private void dfs(TreeNode root, int v, int d, int curDepth) {
        if (root == null) {
            return;
        }
        curDepth++;
        if (curDepth < d - 1) {
            dfs(root.left, v, d, curDepth);
            dfs(root.right, v, d, curDepth);
        } else if (curDepth == d - 1) {
            TreeNode tmpLeft = root.left;
            TreeNode tmpRight = root.right;
            root.left = new TreeNode(v);
            root.right = new TreeNode(v);
            root.left.left = tmpLeft;
            root.right.right = tmpRight;
        }

    }

}
