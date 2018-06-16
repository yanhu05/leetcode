package main.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgeRouteCircleTest {

    @Test
    void judgeCircle() {
        assertEquals(true, new JudgeRouteCircle().judgeCircle("LLRRUUDD"));
    }
}