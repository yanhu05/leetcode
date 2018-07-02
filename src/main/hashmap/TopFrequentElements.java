package main.hashmap;

import java.util.*;

// https://leetcode.com/problems/top-k-frequent-elements/description/

public class TopFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        if (nums == null) return list;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer cnt = map.get(num);
                map.put(num, ++cnt);
            } else {
                map.put(num, 1);
            }
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int num : map.keySet()) {
            int[] frq = new int[2];
            frq[0] = num;
            frq[1] = map.get(num);
            q.add(frq);
        }

        int i = 0;

        while (i < k) {
            list.add(q.poll()[0]);
            i++;
        }
        return list;
    }
}
