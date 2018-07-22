package main.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Number1BitsTest {

    @Test
    void hammingWeight() {
        assertEquals(3, new Number1Bits().hammingWeight(11));

        assertEquals(1, new Number1Bits().hammingWeight(128));
    }
}