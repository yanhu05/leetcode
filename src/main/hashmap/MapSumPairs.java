package main.hashmap;

// https://leetcode.com/problems/map-sum-pairs/description/

import java.util.*;

public class MapSumPairs {

    Map<String, List<Node>> map = new HashMap<>();

    public MapSumPairs() {

    }

    public void insert(String key, int val) {
        if (key == null) return;
        Node node = new Node(key, val);
        String prefix = "";
        for (int i = 0; i < key.length(); i++) {
            prefix += String.valueOf(key.charAt(i));
            if (!map.containsKey(prefix)) {
                List<Node> list = new ArrayList<>();
                list.add(node);
                map.put(prefix, list);
            } else {
                List<Node> _list = map.get(prefix);
                Node _node = null;
                for (Node n : _list) {
                    if (n.key == node.key) {
                        _node = n;
                        n.val = node.val;
                        break;
                    }
                }
                if (_node == null) {
                    _list.add(node);
                }
            }
        }
    }

    public int sum(String prefix) {
        int sum = 0;
        List<Node> _list = map.get(prefix);
        if (_list != null) {
            for (Node n : _list) {
                sum += n.val;
            }
        }
        return sum;
    }

    class Node {
        String key;
        int val;

        Node(String key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
