package main.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllPossibleFullBinaryTreesTest {

    @Test
    void allPossibleFBT() {
        assertEquals(5, new AllPossibleFullBinaryTrees().allPossibleFBT(7).size());
    }
}