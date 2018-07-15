package main.greedy;

/*

https://leetcode.com/problems/advantage-shuffle/description/


 */

import java.util.Arrays;

public class AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int[] res = new int[A.length];
        boolean[] used = new boolean[A.length];
        for (int i = 0; i < B.length; i++) {
            boolean found = false;
            for (int j = 0; j < A.length; j++) {
                if (A[j] <= B[i] || used[j]) continue;
                res[i] = A[j];
                used[j] = true;
                found = true;
                break;
            }
            if (!found) {
                for (int j = 0; j < A.length; j++) {
                    if (used[j]) continue;
                    res[i] = A[j];
                    used[j] = true;
                    break;
                }
            }
        }
        return res;
    }
}
