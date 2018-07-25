package main.array;

/*

https://www.youtube.com/watch?v=OKd534EWcdk

 */
public class CountingSort {

    public int[] sort(int[] nums) {
        if (nums == null) return nums;
        int[] counts = new int[nums.length];
        for (int num : nums) {
            counts[num]++;
        }

        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }

        for (int i = counts.length - 1; i > 0; i--) {
            counts[i] = counts[i - 1];
        }
        counts[0] = 0;

        int[] res = new int[nums.length];

        for (int i : nums) {
            int index = counts[i];
            res[index] = i;
            counts[i]++;
        }
        return res;
    }
}
