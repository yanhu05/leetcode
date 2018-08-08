package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquaresTest {

    @Test
    void numSquares() {
        assertEquals(3, new PerfectSquares().numSquares(12));

        assertEquals(2, new PerfectSquares().numSquares(13));
    }
}