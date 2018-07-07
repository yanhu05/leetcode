package main.linkedlist;

/*

https://leetcode.com/problems/odd-even-linked-list/description/

Accepted without any hints.

Thought process
Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL
Start from the answer.  How do we get to 1->3->5->2->4->NULL?
if we can put all odd together and even together, then it is easy to just connect the tail of odd and head of even.

 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        ListNode current = even.next;
        while (current != null) {
            odd.next = current;
            odd = odd.next;
            even.next = current.next;
            even = even.next;
            current = even != null ? even.next : null;
        }
        odd.next = evenHead;
        return head;
    }
}
