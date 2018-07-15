package main.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvantageShuffleTest {

    @Test
    void advantageCount() {
        int[] A = {2, 7, 11, 15};
        int[] B = {1, 10, 4, 11};

        //   assertEquals(11, new AdvantageShuffle().advantageCount(A, B)[1]);

        int[] A1 = {12, 24, 8, 32};
        int[] B1 = {13, 25, 32, 11};

        //   assertEquals(8, new AdvantageShuffle().advantageCount(A1, B1)[2]);


        int[] A2 = {2, 0, 4, 1, 2};
        int[] B2 = {1, 3, 0, 0, 2};

        assertEquals(1, new AdvantageShuffle().advantageCount(A2, B2)[2]);

        int[] A3 = {718967141, 189971378, 341560426, 23521218, 339517772};
        int[] B3 = {967482459, 978798455, 744530040, 3454610, 940238504};

        assertEquals(1, new AdvantageShuffle().advantageCount(A3, B3)[2]);


    }
}