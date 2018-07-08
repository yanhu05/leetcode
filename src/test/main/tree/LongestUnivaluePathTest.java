package main.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestUnivaluePathTest {

    @Test
    void longestUnivaluePath() {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(5);

        assertEquals(3, new LongestUnivaluePath().longestUnivaluePath(root));
    }
}