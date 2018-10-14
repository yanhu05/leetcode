package main.array;

// https://leetcode.com/problems/smallest-range-i/description/


import java.util.Arrays;

public class SmallestRange {

    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int low = A[0] + K;
        int start = -K;
        int min = Integer.MAX_VALUE;
        while (start <= K) {
            int high = A[A.length - 1] + start;
            int diff = Math.abs(high - low);
            min = Math.min(min, diff);
            start++;
        }
        return min;
    }
}
