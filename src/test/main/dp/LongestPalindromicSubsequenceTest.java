package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubsequenceTest {

    @Test
    void longestPalindromeSubseq() {
        assertEquals(4, new LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab"));
    }
}