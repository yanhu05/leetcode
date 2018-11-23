package main.tree;
/*

https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

Thought process

Need to detect that very subtree is a pre oder traversal

To solve a tree problem in general
   Does level, pre, in or post order traversal work?
   pretend subtree has resolve issue

*/

public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);  // assume it has done pre order traversal
        flatten(root.right); //  assume it has done pre order traversal
        TreeNode tmp = root.left;
        while (tmp != null && tmp.right != null) {
            tmp = tmp.right;
        }
        if (tmp != null) {
            tmp.right = root.right;
        }
        root.right = root.left != null ? root.left : root.right;
        root.left = null;
    }
}
