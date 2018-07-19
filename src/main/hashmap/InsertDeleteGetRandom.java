package main.hashmap;

/*

https://leetcode.com/problems/insert-delete-getrandom-o1/description/

Solve it partially,
Good: Know the right data structures: HashMap and Arraylist
getRandom() requires an array so that we can randomize indexes;
HashMap stores val as key and index of that val in array as value;

Bad: Got stuck about removing an element from an Arraylist in O(1)
Only option is removing last element.

 */

import java.util.*;

public class InsertDeleteGetRandom {

    Map<Integer, Integer> myMap = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    /**
     * Initialize your data structure here.
     */
    public InsertDeleteGetRandom() {
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (myMap.containsKey(val)) return false;
        myMap.put(val, list.size());
        list.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        Integer index = myMap.get(val);
        if (index == null) return false;
        int lastIndex = list.size() - 1;
        if (index < lastIndex) {
            int lastNum = list.get(lastIndex);
            list.set(index, lastNum);
            myMap.put(lastNum, index);
        }
        list.remove(lastIndex);
        myMap.remove(val);
        return true;

    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        Random r = new Random();
        return list.get(r.nextInt(list.size()));
    }
}
