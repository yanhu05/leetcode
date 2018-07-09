package main.linkedlist;

/*

https://leetcode.com/problems/linked-list-cycle-ii/description/


*/


import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        do {
            slow = slow.next;
            fast = fast.next != null ? fast.next.next : null;
            if (slow == fast) break;
        } while (fast != null);

        if (fast != null) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }


    public ListNode detectCycleExtraSpace(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.add(head)) {
                head = head.next;
            } else {
                return head;
            }
        }
        return null;
    }
}
