package main.tree;

/*


https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/

It can be reduced to O(n) time and O(n) space;
Optimaztion 2 passes

1 pass find depth of all nodes

2nd pass finds the node with all deepest nodes

 */
public class SmallestSubtreeWithAllDeepestNodes {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return root;
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);

        if (left == right) return root;

        if (left > right) return subtreeWithAllDeepest(root.left);
        return subtreeWithAllDeepest(root.right);
    }

    int maxHeight(TreeNode node) {
        if (node == null) return 0;
        int left = maxHeight(node.left);
        int right = maxHeight(node.right);
        return left > right ? left + 1 : right + 1;
    }
}
