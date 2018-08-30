package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringRepeatingCharactersTest {

    @Test
    void longestSubstring() {
        assertEquals(0, new LongestSubstringRepeatingCharacters().longestSubstring("ababacb", 3));
        assertEquals(3, new LongestSubstringRepeatingCharacters().longestSubstring("aaabb", 3));
        assertEquals(5, new LongestSubstringRepeatingCharacters().longestSubstring("ababbc", 2));

    }
}