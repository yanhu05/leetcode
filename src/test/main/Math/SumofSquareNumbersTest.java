package main.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumofSquareNumbersTest {

    @Test
    void judgeSquareSum() {
        assertEquals(true, new SumofSquareNumbers().judgeSquareSum(100000));
    }
}