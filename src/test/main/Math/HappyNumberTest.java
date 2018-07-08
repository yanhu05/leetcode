package main.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {


    @Test
    void isHappy() {

        assertEquals(true, new HappyNumber().isHappy(133));
        assertEquals(false, new HappyNumber().isHappy(197));
    }
}