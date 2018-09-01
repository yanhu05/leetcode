package main.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void get() {

        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        assertEquals(-1, cache.get(2));
        cache.get(3);       // returns 3
        cache.put(4, 4);    // evicts key 1.

        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));

        cache = new LRUCache(0);
        cache.put(0, 0);
        assertEquals(-1, cache.get(0));


        cache = new LRUCache(2);
        cache.get(2);
        cache.put(2, 6);
        cache.get(1);
        cache.put(1, 5);
        cache.put(1, 2);
        cache.get(1);
        cache.get(2);


        cache = new LRUCache(1);
        cache.put(2, 1);
        cache.get(2);
        cache.put(3, 2);
        cache.get(2);
        cache.get(3);

    }
}