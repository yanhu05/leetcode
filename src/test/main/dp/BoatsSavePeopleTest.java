package main.dp;

import main.greedy.BoatsSavePeople;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatsSavePeopleTest {

    @Test
    void numRescueBoats() {
        int[] people = {1, 2};
        assertEquals(1, new BoatsSavePeople().numRescueBoats(people, 3));
        int[] people1 = {3, 5, 3, 4};
        assertEquals(2, new BoatsSavePeople().numRescueBoats(people1, 8));

        int[] people2 = {445, 597, 385, 576, 291, 190, 187, 613, 657, 477};
        assertEquals(5, new BoatsSavePeople().numRescueBoats(people2, 1000));
    }
}