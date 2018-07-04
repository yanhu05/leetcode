package main.array;

/*

https://leetcode.com/problems/single-element-in-a-sorted-array/description/

 */

public class SingleElementSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[len - 2] != nums[len - 1]) return nums[len - 1];
        int low = 0;
        int high = len;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == nums[mid - 1]) {
                if ((mid - 1 - low) % 2 == 0) {
                    low = mid + 1;
                } else {
                    high = mid - 2;
                }
            } else if (nums[mid] == nums[mid + 1]) {
                if ((mid - low) % 2 == 0) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid; // found;
                break;
            }

        }
        return nums[low];
    }
}
