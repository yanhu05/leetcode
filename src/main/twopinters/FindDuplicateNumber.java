package main.twopinters;

/*

https://leetcode.com/problems/find-the-duplicate-number/description/

https://www.quora.com/How-does-Floyds-cycle-finding-algorithm-work-How-does-moving-the-tortoise-to-the-beginning-of-the-linked-list-while-keeping-the-hare-at-the-meeting-place-followed-by-moving-both-one-step-at-a-time-make-them-meet-at-starting-point-of-the-cycle

Cycle Detection

Floyd Tortoise and Hare

 */
public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
