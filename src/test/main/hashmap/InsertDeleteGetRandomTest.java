package main.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertDeleteGetRandomTest {

    @Test
    void getRandom() {
        InsertDeleteGetRandom instance = new InsertDeleteGetRandom();
        instance.insert(1);
        instance.remove(2);
        instance.insert(2);
        assertEquals(1, instance.getRandom());
    }
}