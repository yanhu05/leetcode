package main.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertBSTTest {

    @Test
    void insertIntoBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        new InsertBST().insertIntoBST(root, 5);

        assertEquals(5, root.right.left.val);
    }
}