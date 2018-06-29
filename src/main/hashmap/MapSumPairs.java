package main.hashmap;

// https://leetcode.com/problems/map-sum-pairs/description/

import java.util.*;

public class MapSumPairs {

    Map<String, Integer> map = new HashMap<>();

    public MapSumPairs() {

    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String key : map.keySet()) {
            if (key.startsWith(prefix)) {
                sum += map.get(key);
            }

        }
        return sum;
    }

}
