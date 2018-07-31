package main.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneGameTest {

    @Test
    void stoneGame() {
        int[] piles = {5, 3, 4, 5};
        assertEquals(true, new StoneGame().stoneGame(piles));

        int[] piles1 = {2, 6, 4, 8, 7, 10};
        assertEquals(true, new StoneGame().stoneGame(piles1));


        int[] piles2 = {2, 5, 4, 6, 8, 7, 2};
        assertEquals(true, new StoneGame().stoneGame(piles2));
    }
}