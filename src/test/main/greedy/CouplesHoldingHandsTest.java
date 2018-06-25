package main.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CouplesHoldingHandsTest {

    @Test
    void minSwapsCouples() {
        int[] row = {0, 2, 1, 3};
        assertEquals(1, new CouplesHoldingHands().minSwapsCouples(row));
        int[] row1 = {3, 2, 0, 1};
        assertEquals(0, new CouplesHoldingHands().minSwapsCouples(row1));
        int[] row2 = {1, 4, 0, 5, 8, 7, 6, 3, 2, 9};
        assertEquals(3, new CouplesHoldingHands().minSwapsCouples(row2));
    }
}