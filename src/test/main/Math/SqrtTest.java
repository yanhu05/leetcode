package main.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void mySqrt() {
        assertEquals(2, new Sqrt().mySqrt(9));
    }
}