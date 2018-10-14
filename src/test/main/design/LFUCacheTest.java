package main.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LFUCacheTest {

    @Test
    void get() {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        assertEquals(-1, cache.get(2));
        cache.get(3);       // returns 3
        cache.put(4, 4);    // evicts key 1.

        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));

        cache = new LFUCache(0);
        cache.put(0, 0);
        assertEquals(-1, cache.get(0));


        cache = new LFUCache(3);
        cache.put(2, 2);
        cache.put(1, 1);
        cache.get(2);
        cache.get(1);
        cache.get(2);
        cache.put(3, 3);
        cache.put(4, 4);
        cache.get(3);
        cache.get(2);
        cache.get(1);
        cache.get(4);


    }

    @Test
    void isMonotonic() {
        int[] nums = {1, 3, 2};

        assertEquals(false, new LFUCache(2).isMonotonic(nums));
    }
}