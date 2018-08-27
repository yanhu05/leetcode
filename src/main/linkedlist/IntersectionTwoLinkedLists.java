package main.linkedlist;

/*

https://leetcode.com/problems/intersection-of-two-linked-lists/


 */

public class IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int len1 = getLen(headA);
        int len2 = getLen(headB);
        if (len1 > len2) {
            int diff = len1 - len2;
            while (diff != 0) {
                headA = headA.next;
                diff--;
            }
        } else if (len1 < len2) {
            int diff = len2 - len1;
            while (diff != 0) {
                headB = headB.next;
                diff--;
            }
        }
        while (headB != null && headA != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int getLen(ListNode node) {
        if (node == null) return 0;
        ListNode current = node;
        int len = 0;
        while (current != null) {
            len++;
            current = current.next;
        }
        return len;
    }
}
