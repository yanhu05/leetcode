package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    @Test
    void findPeakElement() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        assertEquals(1, new FindPeakElement().findPeakElement(nums));
    }
}