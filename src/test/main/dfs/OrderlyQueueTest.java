package main.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderlyQueueTest {

    @Test
    void orderlyQueue() {
        assertEquals("acb", new OrderlyQueue().orderlyQueue("cba", 1));
    }
}