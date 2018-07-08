package main.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapSumPairsTest {

    @Test
    void sum() {
        MapSumPairs instance = new MapSumPairs();
        instance.insert("apple", 3);
        assertEquals(3, instance.sum("ap"));
        instance.insert("app", 2);
        assertEquals(5, instance.sum("ap"));
        instance.insert("app", 3);
        assertEquals(6, instance.sum("ap"));
    }
}