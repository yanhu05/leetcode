package main.tree;

//https://leetcode.com/problems/binary-tree-preorder-traversal/description/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                myList.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return myList;
    }
}
