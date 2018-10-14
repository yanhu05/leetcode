package main.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ConstructBinaryTreePreorderInorderTest {

    @Test
    void buildTree() {

        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};

        assertEquals(null, new ConstructBinaryTreePreorderInorder().buildTree(pre, in));
    }
}