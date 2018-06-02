package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringsTest {

    @Test
    void countSubstrings() {
        assertEquals(6, new PalindromicSubstrings().countSubstrings("aaa"));
        assertEquals(4, new PalindromicSubstrings().countSubstrings("aba"));
    }

}