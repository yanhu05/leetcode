package main.linkedlist;
/*
https://leetcode.com/problems/linked-list-components/description/

Bad problem description

2 pointers

*/

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {

    public int numComponents(ListNode head, int[] G) {

        if (head == null || G == null) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i : G) {
            set.add(i);
        }
        ListNode fast = head, slow = head;
        int cnt = 0;
        while (fast != null) {
            if (!set.contains(slow.val)) {
                slow = slow.next;
                fast = slow;
            } else if (!set.contains(fast.val)) {
                cnt++;
                fast = fast.next;
                slow = fast;
            } else {
                fast = fast.next;
            }
        }

        if (slow != null) {
            cnt++;
        }

        return cnt;
    }

}
