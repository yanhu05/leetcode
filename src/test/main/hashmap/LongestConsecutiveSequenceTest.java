package main.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    void longestConsecutive() {
        int[] nums = {100, 3, 2, 4, 200, 1, 3, 2, 5, 6, 9, 10, 7};

        assertEquals(7, new LongestConsecutiveSequence().longestConsecutive(nums));

    }
}