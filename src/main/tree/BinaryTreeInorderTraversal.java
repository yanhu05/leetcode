package main.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-inorder-traversal/description/


public class BinaryTreeInorderTraversal {
    List<Integer> myList = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            myList.add(node.val);
            push(node.right);
        }
        return myList;
    }

    private void push(TreeNode node) {
        if (node == null) {
            return;
        }
        stack.push(node);
        push(node.left);
    }
}
