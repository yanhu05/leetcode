package main.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecoverBSTTest {

    @Test
    void recoverTreeExtraSpace() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        new RecoverBST().recoverTreeExtraSpace(root);
        assertEquals(3, root.val);
    }


    @Test
    void recoverTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        new RecoverBST().recoverTree(root);
        assertEquals(3, root.val);

        root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        new RecoverBST().recoverTree(root);
        assertEquals(2, root.val);


        root = new TreeNode(5);
        root.left = new TreeNode(7);
        root.right = new TreeNode(3);
        new RecoverBST().recoverTree(root);
        assertEquals(3, root.left.val);
    }
}