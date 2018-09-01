package main.design;

import java.util.HashMap;
import java.util.Map;

/*

https://leetcode.com/problems/lru-cache/description/

*/

public class LRUCache {
    int capacity;
    Map<Integer, Node> map = new HashMap<>();
    Node tail;
    Node head;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node current = map.get(key);
            if (current == tail) return current.val;
            moveToLast(current);
            return current.val;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (this.capacity == 0) return;
        if (map.size() == 0) {
            Node node = new Node(key, value);
            map.put(key, node);
            head = tail = node;
            return;
        }

        Node node = map.get(key);
        if (node != null) {
            node.val = value;
            moveToLast(node);
            return;
        }


        node = new Node(key, value);


        // eviction needed
        if (map.size() == this.capacity) {
            map.remove(head.key);
            head = head.next;
            if (head == null) {
                tail = null;
                head = tail = node;
                map.put(key, node);
                return;
            }
            head.previous = null;
        }
        map.put(key, node);
        node.previous = tail;
        tail.next = node;
        tail = node;
        tail.next = null;

    }

    private void moveToLast(Node node) {
        if (node == null || tail == node || (node.previous == null && node.next == null)) return;
        // detach node
        Node tmpPrevious = node.previous;
        Node tmpNext = node.next;
        if (tmpNext != null) {
            tmpNext.previous = tmpPrevious;
        }

        if (tmpPrevious != null) {
            tmpPrevious.next = tmpNext;
        }
        // put it at tail
        if (node == head) {
            head = node.next;
        }
        node.previous = tail;
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    private class Node {
        int key;
        int val;
        Node previous, next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}