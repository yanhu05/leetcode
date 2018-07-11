package main.greedy;

/*

https://leetcode.com/problems/partition-labels/description/

Must work out basic algo before coding

1. Basic algo is a) Find index of the last occurrence of the current char and append that part to the current one.
   And then the new one might need to expend again due to newly added chars. At this point, we know the baisc algo
2: Now we improve it. How to find the index of th last occurrence efficiently.  Brute force is using another loop. But that would be O(n^2) solution

*/

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        int[] lastPOS = new int[26];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            lastPOS[c - 'a'] = i;
        }
        int secondPointer = 0;
        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a';
            int lastPos = lastPOS[index];
            if (lastPos > secondPointer) {
                secondPointer = lastPos;
            }
            if (secondPointer == i) {
                list.add(i - start + 1);
                start = i + 1;
            }
        }
        return list;
    }
}
