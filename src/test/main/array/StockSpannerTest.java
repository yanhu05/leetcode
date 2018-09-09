package main.array;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockSpannerTest {

    @Test
    void next() {
        StockSpanner s = new StockSpanner();
        assertEquals(1, s.next(100));
        assertEquals(1, s.next(80));
        assertEquals(1, s.next(60));
        assertEquals(2, s.next(70));
        assertEquals(1, s.next(60));
        assertEquals(4, s.next(75));
        assertEquals(6, s.next(85));

        s = new StockSpanner();

        assertEquals(1, s.next(29));
        assertEquals(2, s.next(91));
        assertEquals(1, s.next(62));
        assertEquals(2, s.next(76));
        assertEquals(1, s.next(51));

    }
}