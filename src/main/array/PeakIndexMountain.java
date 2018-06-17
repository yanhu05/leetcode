package main.array;

public class PeakIndexMountain {

    public int peakIndexInMountainArray(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (low == high || (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])) {
                return mid;
            }
            if (nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return mid;
    }
}
