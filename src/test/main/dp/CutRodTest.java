package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CutRodTest {

    @Test
    void cutRod() {
        CutRod cr = new CutRod();
        int rodLength = 8;
        int[] rodPrices = {1, 5, 8, 9, 10, 17, 17, 20};
        assertEquals(22, cr.cutRod(rodLength, rodPrices));
    }
}