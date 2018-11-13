package main.array;

/*

https://leetcode.com/problems/binary-subarrays-with-sum/description/

Brute force is easy O(n);
Pre sum needs a bit insight.

O(n) solution is tricky.

*/

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum {

    public int numSubarraysWithSumTLE1(int[] A, int S) {
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

    public int numSubarraysWithSumTLE2(int[] A, int S) {
        if (A == null) return 0;
        int cnt = 0;

        int[] pSums = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            pSums[i + 1] = pSums[i] + A[i];
        }

        for (int i = 0; i < pSums.length; i++) {
            for (int j = i + 1; j < pSums.length; j++) {
                int diff = Math.abs(pSums[i] - pSums[j]);
                if (diff < S) continue;
                if (diff == S) cnt++;
                if (diff > S) break;
            }
        }

        return cnt;
    }

    public int numSubarraysWithSum(int[] A, int S) {
        if (A == null) return 0;
        int cnt = 0;

        int[] pSums = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            pSums[i + 1] = pSums[i] + A[i];
        }

        // tricky logic
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < pSums.length; i++) {
            int num = pSums[i];
            cnt += map.getOrDefault(num, 0);
            map.put(num + S, map.getOrDefault(num + S, 0) + 1);
        }

        return cnt;
    }


}
