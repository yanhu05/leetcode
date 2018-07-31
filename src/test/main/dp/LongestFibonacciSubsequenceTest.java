package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestFibonacciSubsequenceTest {

    @Test
    void lenLongestFibSubseq() {
        int[] nums = {1, 3, 7, 11, 12, 14, 18};
        assertEquals(3, new LongestFibonacciSubsequence().lenLongestFibSubseq(nums));

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(5, new LongestFibonacciSubsequence().lenLongestFibSubseq(nums1));

        int[] nums3 = {2, 5, 6, 7, 8, 10, 12, 17, 24, 41, 65};

        assertEquals(5, new LongestFibonacciSubsequence().lenLongestFibSubseq(nums3));
    }
}