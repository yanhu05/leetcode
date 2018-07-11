package main.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*

https://leetcode.com/problems/recover-binary-search-tree/description/

Thought process : Always start from the bottom and see how to arrival at the results

1:  It is a BST.  It screams In order traversal
2:  Find a simple example and look for patterns  such as  3, 7, 5, 8  and 3, 7, 5, 4. These are 2 different cases
 */
public class RecoverBST {

    TreeNode node1;
    TreeNode node2;
    TreeNode previous = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        if (root == null) return;
        findNodes(root);
        swap(node1, node2);
    }

    private void findNodes(TreeNode root) {
        if (root == null) return;
        findNodes(root.left);

        if (node1 != null && root.val < previous.val) {
            node2 = root;
        }
        if (node1 == null && root.val < previous.val) {
            node1 = previous;
            node2 = root;
        }
        previous = root;
        findNodes(root.right);
    }

    private void swap(TreeNode node1, TreeNode node2) {
        int tmp = node1.val;
        node1.val = node2.val;
        node2.val = tmp;
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
