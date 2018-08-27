package main.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTwoLinkedListsTest {

    @Test
    void getIntersectionNode() {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);
        ListNode commHead = new ListNode(9);
        commHead.next = new ListNode(11);
        headB.next = new ListNode(12);
        headB.next.next = commHead;
        headA.next = commHead;

        assertEquals(commHead, new IntersectionTwoLinkedLists().getIntersectionNode(headA, headB));

    }
}