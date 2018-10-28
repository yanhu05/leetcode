package main.array;

/*

https://leetcode.com/problems/binary-subarrays-with-sum/description/

 */

public class BinarySubarraysWithSum {

    public int numSubarraysWithSumTLE(int[] A, int S) {
        if (A == null) return 0;
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            int fast = i + 1;
            int sum = A[i];
            if (sum == S) cnt++;
            while (fast < A.length) {
                sum += A[fast];
                if (sum < S) {
                    fast++;
                } else if (sum == S) {
                    cnt++;
                    fast++;
                } else {
                    break;
                }
            }

        }
        return cnt;

    }
}
