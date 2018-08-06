package main.linkedlist;

public class MiddleLinkedList {

    public ListNode middleNode(ListNode head) {
        if (head == null) return head;
        int cnt = 0;
        ListNode current = head;
        while (current != null) {
            cnt++;
            current = current.next;
        }
        int mid = cnt / 2 + 1;
        current = head;
        while (mid > 1) {
            mid--;
            current = current.next;
        }
        return current;
    }
}
