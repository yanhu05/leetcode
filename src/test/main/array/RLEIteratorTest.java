package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RLEIteratorTest {


    @Test
    void next() {
        int[] nums = {3, 8, 0, 9, 2, 5};
        RLEIterator r = new RLEIterator(nums);
        assertEquals(8, r.next(2));
        assertEquals(8, r.next(1));
        assertEquals(5, r.next(1));
        assertEquals(-1, r.next(2));

    }
}