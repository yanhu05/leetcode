package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    void coinChange() {
        int[] coins = {2, 5};
        assertEquals(-1, new CoinChange().coinChange(coins, 1));

        int[] coins1 = {2, 2, 5};
        assertEquals(3, new CoinChange().coinChange(coins1, 12));

        int[] coins2 = {474, 83, 404, 3};
        assertEquals(8, new CoinChange().coinChange(coins2, 264));
    }
}