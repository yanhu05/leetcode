package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubstringTest {

    @Test
    void longestCommonSubstring() {
        LongestCommonSubstring instance = new LongestCommonSubstring();
        assertEquals(5, instance.longestCommonSubstring("GeeksforGeeks", "GeeksQuiz"));
        assertEquals(0, instance.longestCommonSubstring("", "GeeksQuiz"));
        assertEquals(4, instance.longestCommonSubstring("abcdxyz", "xyzabcd"));
        assertEquals(6, instance.longestCommonSubstring("zxabcdezy", "yzabcdezx"));
    }
}