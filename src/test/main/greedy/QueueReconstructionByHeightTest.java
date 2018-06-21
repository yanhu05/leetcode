package main.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueReconstructionByHeightTest {

    @Test
    void reconstructQueue() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] newPeople = new QueueReconstructionByHeight().reconstructQueue(people);
        assertEquals(2, newPeople[2][1]);


        int[][] people2 = {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}};
        newPeople = new QueueReconstructionByHeight().reconstructQueue(people2);
        assertEquals(2, newPeople[2][1]);

    }
}