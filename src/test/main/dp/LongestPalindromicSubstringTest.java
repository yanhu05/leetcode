package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void longestPalindrome() {
        assertEquals("a", new LongestPalindromicSubstring().longestPalindrome("abcda"));
    }
}