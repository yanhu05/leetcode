package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuySellStockTest {

    @Test
    void maxProfit() {
        int[] prices = {1, 3, 2, 8, 4, 9};
        assertEquals(8, new BuySellStock().maxProfitTLE(prices, 2));

        int[] prices1 = {1, 3, 7, 5, 10, 3};
        assertEquals(6, new BuySellStock().maxProfitTLE(prices1, 3));
    }
}