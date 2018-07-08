package main.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {


    @Test
    void isHappy() {

        assertEquals(true, new HappyNumber().isHappy(133));
        assertEquals(false, new HappyNumber().isHappy(197));

        assertEquals(true, new HappyNumber().isHappyCycleDetection(19));
        assertEquals(false, new HappyNumber().isHappyCycleDetection(197));

        assertEquals(true, new HappyNumber().isHappyCycleDetection(1));
        assertEquals(false, new HappyNumber().isHappyCycleDetection(10));
    }
}