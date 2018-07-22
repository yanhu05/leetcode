package main.array;

/*

https://leetcode.com/problems/flatten-nested-list-iterator/description/

 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NestedIterator implements Iterator<Integer> {

    Queue<Integer> q = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (NestedInteger i : nestedList) {
            if (i.isInteger()) {
                q.offer(i.getInteger());
                continue;
            }
            flatten(i);
        }
    }

    private void flatten(NestedInteger ni) {
        if (ni.isInteger()) {
            q.offer(ni.getInteger());
            return;
        }
        List<NestedInteger> nestedList = ni.getList();
        for (NestedInteger i : nestedList) {
            if (i.isInteger()) {
                q.offer(i.getInteger());
                continue;
            }
            flatten(i);
        }
    }


    @Override
    public Integer next() {
        return q.isEmpty() ? null : q.poll();

    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }

}
