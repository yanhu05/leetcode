package main.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void detectCycle() {
        int[] nums = {1};
        assertEquals(null, new LinkedListCycle().detectCycle(ListNode.generateLinkedList(nums)));
    }
}