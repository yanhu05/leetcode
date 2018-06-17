package main.tree;


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
    int pos = 0;
    TreeNode node1;
    TreeNode node2;

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
