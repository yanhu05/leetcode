package main.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    @Test
    void partition() {
        assertEquals(2, new PalindromePartitioning().partition("aab").size());
    }
}