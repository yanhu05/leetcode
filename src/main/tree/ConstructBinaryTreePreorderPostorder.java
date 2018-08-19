package main.tree;
/*


https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/solution/

Thought process

Recursion and each subtree should be constructed just like the current tree.
subtree should have their own pre and post.

High level code should like

root = new TreeNode(x);
root.left = constructTree(preLeft, postLeft);
root.right =  constructTree(preRight, postRight);
return root;

How do we find out preLeft, postLeft , preRight and postRight?


*/

import java.util.Arrays;

public class ConstructBinaryTreePreorderPostorder {


    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int len = pre.length;
        if (len == 0) return null;
        TreeNode root = new TreeNode(pre[0]);
        if (len == 1) return root;

        int cnt = 0;
        // Find how many elements should be in the left tree, which is bound by the last element in post[].
        // pre = [1,2,4,5,3,6,7], post = [4,5,2,6,7,3,1]

        /*
           Optimization
           cnt is actually just index in post. Couple with the fact that elements are unqiue. We can use a Hashtable to reduce run time from O(n^2) to O(n)

         */
        for (int i : post) {
            cnt++;
            if (i == pre[1]) break;
        }

        int[] preLeft = Arrays.copyOfRange(pre, 1, cnt + 1);
        int[] postLeft = Arrays.copyOfRange(post, 0, cnt);

        /*
           Optimization

           Pass just index to save space from O(n^2) to O(n)

         */

        root.left = constructFromPrePost(preLeft, postLeft);
        int[] preRight = Arrays.copyOfRange(pre, cnt + 1, len);
        int[] postRight = Arrays.copyOfRange(post, cnt, len);

        root.right = constructFromPrePost(preRight, postRight);
        return root;
    }
}
