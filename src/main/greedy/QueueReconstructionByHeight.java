package main.greedy;

/*
    https://leetcode.com/problems/queue-reconstruction-by-height/description/

    apply the standard algorithm
    sort and then insert

 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, Comparator.comparing((int[] person) -> person[0]).reversed().thenComparing((int[] person) -> person[1]));

        LinkedList<int[]> list = new LinkedList<>();

        for (int[] person : people) {
            list.add(person[1], person);
        }

        int[][] newQ = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            newQ[i] = list.get(i);
        }

        return newQ;
    }
}
