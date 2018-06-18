package main.tree;

import jdk.nashorn.api.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountCompleteTreeNodesTest {

    @Test
    void countNodes() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        assertEquals(3, new CountCompleteTreeNodes().countNodes(root));

    }
}