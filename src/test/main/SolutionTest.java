package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void validMountainArray() {

        assertEquals(5, new Solution().diStringMatch("DDI").length);
    }
}