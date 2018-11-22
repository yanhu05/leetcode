package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipStringMonotoneIncreasingTest {

    @Test
    void minFlipsMonoIncr() {
        FlipStringMonotoneIncreasing flipper = new FlipStringMonotoneIncreasing();

        assertEquals(1, flipper.minFlipsMonoIncr("00110"));
        assertEquals(2, flipper.minFlipsMonoIncr("010110"));
        assertEquals(2, flipper.minFlipsMonoIncr("00011000"));
        assertEquals(5, flipper.minFlipsMonoIncr("10011111110010111011"));
        assertEquals(3, flipper.minFlipsMonoIncr("0101100011"));
    }
}