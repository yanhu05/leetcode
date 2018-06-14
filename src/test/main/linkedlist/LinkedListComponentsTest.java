package main.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListComponentsTest {

    @Test
    void numComponents() {
        int[] nums = {0, 1, 2, 3};
        ListNode head = ListNode.generateLinkedList(nums);
        int[] subset = {0, 1, 3};
        assertEquals(2, new LinkedListComponents().numComponents(head, subset));


        int[] nums1 = {0, 1, 2, 3, 4};
        head = ListNode.generateLinkedList(nums1);
        int[] subset1 = {0, 3, 1, 4};
        assertEquals(2, new LinkedListComponents().numComponents(head, subset1));
    }
}