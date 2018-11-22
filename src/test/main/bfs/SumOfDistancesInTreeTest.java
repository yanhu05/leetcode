package main.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDistancesInTreeTest {

    @Test
    void sumOfDistancesInTree() {

        int[][] edges = {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}};
        int[] expected = {8, 12, 6, 10, 10, 10};
        assertArrayEquals(expected, new SumOfDistancesInTree().sumOfDistancesInTree(6, edges));
    }
}