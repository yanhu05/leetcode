package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    @Test
    void longestCommonSubsequence() {
        LongestCommonSubsequence instance = new LongestCommonSubsequence();
        assertEquals(3, instance.longestCommonSubsequence("ABCDGH", "AEDFHR"));
        assertEquals(4, instance.longestCommonSubsequence("AGGTAB", "GXTXAYB"));
    }
}