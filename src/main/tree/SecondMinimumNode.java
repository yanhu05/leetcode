package main.tree;

import java.util.PriorityQueue;

public class SecondMinimumNode {

    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        helper(root, q);
        int min = q.poll();
        while (!q.isEmpty()) {
            int secondMin = q.poll();
            if (secondMin > min) return secondMin;
        }
        return -1;
    }

    void helper(TreeNode root, PriorityQueue<Integer> q) {
        if (root == null) return;
        q.offer(root.val);
        helper(root.left, q);
        helper(root.right, q);
    }
}
