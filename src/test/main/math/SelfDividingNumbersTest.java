package main.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelfDividingNumbersTest {

    @Test
    void selfDividingNumbers() {
        assertEquals(13, new SelfDividingNumbers().selfDividingNumbers(1, 22).size());
    }
}