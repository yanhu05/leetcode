package main.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopFrequentElementsTest {

    @Test
    void topKFrequent() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        assertEquals(2, new TopFrequentElements().topKFrequent(nums, 2).size());
    }
}