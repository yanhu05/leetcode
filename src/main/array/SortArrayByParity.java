package main.array;

// https://leetcode.com/problems/sort-array-by-parity/description/

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        if (A == null) return A;
        int odd = 0;
        int even = A.length - 1;
        while (odd < even) {
            if (A[odd] % 2 == 1 && A[even] % 2 == 0) {
                int tmp = A[odd];
                A[odd] = A[even];
                A[even] = tmp;
                odd++;
                even--;
            } else {
                if (A[odd] % 2 == 0) {
                    odd++;
                }
                if (A[even] % 2 == 1) {
                    even--;
                }

            }
        }
        return A;
    }
}
