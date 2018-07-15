package main.greedy;

/*

https://leetcode.com/problems/advantage-shuffle/description/


 */

import java.util.Arrays;

public class AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {
        int[] _b = B.clone();
        Arrays.sort(B);
        Arrays.sort(A);
        int[] tmp = new int[A.length];
        boolean[] used = new boolean[A.length];
        Arrays.fill(tmp, -1);
        int k = 0;
        for (int i = 0; i < B.length; i++) {
            for (int j = k; j < A.length; j++) {
                if (A[j] <= B[i]) continue;
                tmp[i] = A[j];
                used[j] = true;
                k = j + 1;
                break;
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != -1) continue;
            for (int j = 0; j < A.length; j++) {
                if (used[j]) continue;
                used[j] = true;
                tmp[i] = A[j];
                break;
            }
        }
        Arrays.fill(used, false);

        // restore
        int[] res = new int[B.length];
        for (int i = 0; i < _b.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (_b[i] == B[j] && !used[j]) {
                    used[j] = true;
                    res[i] = tmp[j];
                    break;
                }
            }
        }
        return res;
    }
}
