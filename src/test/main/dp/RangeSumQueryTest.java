package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumQueryTest {

    @Test
    void sumRange() {
        int[] input = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery rsq = new RangeSumQuery(input);
        assertEquals(1, rsq.sumRange(0,2));
        assertEquals(-1, rsq.sumRange(2,5));
        assertEquals(-3, rsq.sumRange(0,5));
        assertEquals(0, rsq.sumRange(-1,5));
        assertEquals(0, rsq.sumRange(3,6));
    }
}