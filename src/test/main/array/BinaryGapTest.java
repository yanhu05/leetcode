package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void binaryGap() {
        assertEquals(2, new BinaryGap().binaryGap(22));
        assertEquals(2, new BinaryGap().binaryGap(13));
    }
}