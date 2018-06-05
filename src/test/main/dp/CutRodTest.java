package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CutRodTest {

    @Test
    void cutRod() {
        CutRod cr = new CutRod();
        int rodLength = 8;
        int[] rodPrices = {1, 5, 8, 9, 10, 17, 17, 20};
        assertEquals(22, cr.cutRodBF(rodLength, rodPrices));
        assertEquals(22, cr.cutRodMemoization(rodLength, rodPrices));
        assertEquals(22, cr.cutRodTabulation(rodLength, rodPrices));

        int[] rodPrices1 = {3, 5, 8, 9, 10, 17, 17, 20};
        assertEquals(24, cr.cutRodMemoization(rodLength, rodPrices1));
        assertEquals(24, cr.cutRodTabulation(rodLength, rodPrices1));

    }
}