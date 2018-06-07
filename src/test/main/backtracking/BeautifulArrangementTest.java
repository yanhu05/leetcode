package main.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulArrangementTest {

    @Test
    void countArrangement() {
        BeautifulArrangement obj = new BeautifulArrangement();
        assertEquals(10, obj.countArrangement(5));
    }
}