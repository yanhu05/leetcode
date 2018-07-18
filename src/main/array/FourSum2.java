package main.array;

/*

https://leetcode.com/problems/4sum-ii/description/

 */

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class FourSum2 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        List<Integer> res1 = new ArrayList<>();
        Map<Integer, Integer> res2 = new HashMap<>();

        for (int i : A) {
            for (int j : B) {
                res1.add(i + j);
            }
        }

        for (int i : C) {
            for (int j : D) {
                int sum = i + j;
                res2.put(sum, res2.getOrDefault(sum, 0) + 1);
            }
        }


        int cnt = 0;
        for (int i = 0; i < res1.size(); i++) {
            int target = -res1.get(i);
            cnt += res2.getOrDefault(target, 0);
        }

        return cnt;
    }
}
