package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void missingNumber() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, new MissingNumber().missingNumber(nums));
    }
}