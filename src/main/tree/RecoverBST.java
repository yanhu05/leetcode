package main.tree;


import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*

https://leetcode.com/problems/recover-binary-search-tree/description/

 */
public class RecoverBST {
    boolean found;
    TreeNode node1;
    TreeNode node2;

    public void recoverTree(TreeNode root) {
        if (root == null) return;
        TreeNode min = new TreeNode(Integer.MIN_VALUE);
        TreeNode max = new TreeNode(Integer.MAX_VALUE);
        while (!validBST(root, min, max)) {
            found = false;
            node1 = node2 = null;
            fixNodes(root, min, max);
            int tmp = node1.val;
            node1.val = node2.val;
            node2.val = tmp;
        }

    }

    private void fixNodes(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null || found) return;
        if (root.val < min.val) {
            found = true;
            node1 = root;
            node2 = min;
            return;
        }
        if (root.val > max.val) {
            found = true;
            node1 = root;
            node2 = max;
            return;
        }
        fixNodes(root.left, min, root);
        fixNodes(root.right, root, max);
    }

    private boolean validBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        if (root.val < min.val) {
            return false;
        }
        if (root.val > max.val) {
            return false;
        }
        return validBST(root.left, min, root) && validBST(root.right, root, max);
    }


    //  O(n) time and O(n) space
    int pos = 0;

    public void recoverTreeExtraSpace(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        flattenTree(root, list);
        List sorted = list.stream().sorted((t1, t2) -> t1.val < t2.val ? -1 : t1.val == t2.val ? 0 : 1).collect(Collectors.toList());
        helper(root, sorted);
        int tmp = node1.val;
        node1.val = node2.val;
        node2.val = tmp;
    }

    private void flattenTree(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        flattenTree(root.left, list);
        list.add(root);
        flattenTree(root.right, list);
    }

    private void helper(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        helper(root.left, list);
        TreeNode node = list.get(pos);
        pos++;
        if (node.val != root.val) {
            node1 = root;
            node2 = node;
        }
        helper(root.right, list);
    }
}
