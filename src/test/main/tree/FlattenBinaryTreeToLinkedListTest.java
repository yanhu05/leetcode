package main.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenBinaryTreeToLinkedListTest {

    @Test
    void flatten() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(6);
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        root.left = node1;
        root.right = node2;
        new FlattenBinaryTreeToLinkedList().flatten(root);
        assertEquals(5, root.right.right.val);

    }
}