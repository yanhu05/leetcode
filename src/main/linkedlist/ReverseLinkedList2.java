package main.linkedlist;

/*

https://leetcode.com/problems/reverse-linked-list-ii/

 */

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int cnt = 1;
        ListNode prv = null;
        ListNode prv2 = null;
        ListNode current = head;
        ListNode oldHead = head;
        ListNode newTail = null;
        while (cnt <= n) {
            if (cnt < m) {
                prv = current;
                current = current.next;
                cnt++;
                continue;
            }
            if (cnt == m) {
                newTail = current;
            }
            ListNode next = current.next;
            current.next = prv2;
            prv2 = current;
            current = next;
            cnt++;
        }
        if (prv != null) {
            prv.next = prv2;
        }

        if (newTail != null) {
            newTail.next = current;
        }

        if (m == 1) {
            return prv2;
        }

        return oldHead;
    }
}
