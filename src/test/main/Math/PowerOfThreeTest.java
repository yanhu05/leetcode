package main.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    @Test
    void isPowerOfThree() {
        assertEquals(true, new PowerOfThree().isPowerOfThree(45));
    }
}