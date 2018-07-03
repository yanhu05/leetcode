package main.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceKTest {

    @Test
    void distanceK() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(8);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        assertEquals(1, new DistanceK().distanceK(root, node1, 2).size());

    }
}