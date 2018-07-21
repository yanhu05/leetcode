package main.array;

import java.util.PriorityQueue;

/*

https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

 */
public class KthSmallestElementSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                q.offer(matrix[i][j]);
            }
        }
        int retVal = Integer.MAX_VALUE;
        while (k > 0) {
            retVal = q.poll();
            k--;
        }
        return retVal;
    }
}
