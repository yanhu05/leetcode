package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourSum2Test {

    @Test
    void fourSumCount() {
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        assertEquals(2, new FourSum2().fourSumCount(a, b, c, d));
    }
}