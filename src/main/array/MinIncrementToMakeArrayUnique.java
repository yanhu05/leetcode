package main.array;

import java.util.*;

/*

https://leetcode.com/problems/minimum-increment-to-make-array-unique/

Input: [3,2,1,2,1,7]
Sort   [1,1,2,2,3,7]
       [1,2,2,2,3,7]  1
       [1,2,3,2,3,7]  1+1
       [1,2,3,4,3,7]  1+1 + 2
       [1,2,3,4,5,7]  1+1 + 2 + 2 =6

*/

public class MinIncrementToMakeArrayUnique {

    public int minIncrementForUnique(int[] A) {
        if (A.length == 0) return 0;
        Arrays.sort(A);
        int last = A[0];
        int res = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > last) {
                last = A[i];
                continue;
            }
            last = last + 1;
            res += last - A[i];
        }
        return res;
    }


    public int minIncrementForUniqueTLE(int[] A) {
        if (A.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (!set.add(A[i])) {
                list.add(A[i]);
            }
        }

        if (list.size() == 0) return 0;


        Collections.sort(list);

        int first = 0;
        int totalMoves = 0;
        for (int num : list) {
            if (first > num) {
                totalMoves += (first - num);
            } else {
                first = nextVal(set, num);
                totalMoves += (first - num);
            }
            set.add(first);
            first = nextVal(set, first);


        }
        return totalMoves;
    }

    int nextVal(Set<Integer> existing, int current) {
        do {
            current++;
        } while (existing.contains(current));

        return current;
    }

}
