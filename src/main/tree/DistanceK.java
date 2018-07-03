package main.tree;

import java.util.*;

/*

https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/description/

Thought process:

Most important is to find a way to store a node's parent

 */


public class DistanceK {
    Map<TreeNode, TreeNode> map = new HashMap<>();
    Map<TreeNode, Boolean> visited = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        storeParent(root, null);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        int distance = 0;
        while (distance <= K) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                visited.put(node, true);
                if (distance == K) {
                    list.add(node.val);
                }
                if (node.left != null && !visited.getOrDefault(node.left, false)) {
                    q.offer(node.left);
                }
                if (node.right != null && !visited.getOrDefault(node.right, false)) {
                    q.offer(node.right);

                }
                TreeNode parent = map.get(node);
                if (parent != null && !visited.getOrDefault(parent, false)) {
                    q.offer(parent);
                }
            }
            distance++;
        }

        return list;

    }

    private void storeParent(TreeNode root, TreeNode parent) {
        if (root == null) return;
        map.put(root, parent);
        storeParent(root.left, root);
        storeParent(root.right, root);
    }
}
