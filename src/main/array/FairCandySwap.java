package main.array;

import java.util.HashSet;
import java.util.Set;

/*

https://leetcode.com/contest/weekly-contest-98/problems/fair-candy-swap/

 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i : A) {
            sum1 += i;
        }
        Set<Integer> set = new HashSet<>();
        for (int i : B) {
            sum2 += i;
            set.add(i);
        }

        int avg = (sum1 + sum2) / 2;
        int diff = sum1 - avg;

        for (int i = 0; i < A.length; i++) {
            int target = A[i] - diff;
            if (set.contains(target)) {
                int[] res = new int[2];
                res[0] = A[i];
                res[1] = target;
                return res;
            }
        }
        return null;
    }
}
