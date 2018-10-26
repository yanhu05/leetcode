package main.array;

/*

https://leetcode.com/problems/partition-array-into-disjoint-intervals/description/

 */
public class PartitionArrayDisjointIntervals {

    public int partitionDisjoint(int[] A) {
        int[] mins = new int[A.length];
        int end = A.length - 1;
        mins[end] = A[end];
        for (int i = end - 1; i >= 0; i--) {
            mins[i] = Math.min(A[i], mins[i + 1]);
        }
        int maxHere = A[0];
        int cnt = 0;
        for (int i = 1; i < A.length; i++) {
            if (maxHere <= mins[i]) {
                return ++cnt;
            }
            maxHere = Math.max(maxHere, A[i]);
            ++cnt;
        }
        return cnt;
    }
}
