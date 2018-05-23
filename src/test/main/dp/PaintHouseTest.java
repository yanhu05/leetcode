package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintHouseTest {

    @Test
    void minCost() {
        int[][] inputs ={
                {5,1,7},
                {15,14,3},
                {3,7,6}
        };
        assertEquals(7, new PaintHouse().minCost(inputs));

    }
}