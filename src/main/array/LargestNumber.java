package main.array;

/*

https://leetcode.com/submissions/detail/162466749/

Did alright without looking at the hints. Thought process was correct.
Used a priority queue first. But it was sorted partially correct using the exact comparator below


*/

import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        if (nums == null) return "";
        Integer[] _nums = new Integer[nums.length];
        boolean allZeros = true;
        for (int i = 0; i < nums.length; i++) {
            _nums[i] = nums[i];
            if (nums[i] != 0) allZeros = false;
        }

        if (allZeros) return "0";

        Arrays.sort(_nums, (a, b) -> {
            int cnt = getPower(b);
            Double i = a * Math.pow(10, cnt) + b;
            cnt = getPower(a);
            Double j = b * Math.pow(10, cnt) + a;
            return j.compareTo(i);
        });
        StringBuilder sb = new StringBuilder();
        for (Integer i : _nums) {
            sb.append(i);
        }
        return sb.toString();
    }

    private int getPower(int num) {
        int cnt = 1;
        while (num > 9) {
            num /= 10;
            cnt++;
        }
        return cnt;
    }
}
