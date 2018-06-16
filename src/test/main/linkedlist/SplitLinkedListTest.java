package main.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitLinkedListTest {

    @Test
    void splitListToParts() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);

        assertEquals(5, new SplitLinkedList().splitListToParts(root, 5).length);

    }
}