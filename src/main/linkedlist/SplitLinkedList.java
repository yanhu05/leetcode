package main.linkedlist;

/*
    https://leetcode.com/problems/split-linked-list-in-parts/description/
 */
public class SplitLinkedList {

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] list = new ListNode[k];
        int[] nums = new int[k];

        ListNode current = root;
        int cnt = 0;
        while (current != null) {
            current = current.next;
            cnt++;
        }

        if (k > cnt) {
            for (int i = 0; i < k; i++) {
                nums[i] = 1;
            }
        } else if (cnt % k == 0)
            for (int i = 0; i < k; i++) {
                nums[i] = cnt / k;
            }
        else {
            int tmp = cnt / k;
            int remainder = cnt % k;
            for (int i = 0; i < k; i++) {
                nums[i] = tmp;
                if (remainder > 0) {
                    nums[i]++;
                    remainder--;
                }
            }
        }

        current = root;

        for (int i = 0; i < k; i++) {
            int _cnt = nums[i];
            list[i] = current;
            ListNode last = current;
            while (_cnt > 0 && current != null) {
                last = current;
                current = current.next;
                _cnt--;
            }
            if (last != null) {
                last.next = null;
            }
        }


        return list;
    }

}
