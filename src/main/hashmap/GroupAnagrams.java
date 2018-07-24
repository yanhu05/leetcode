package main.hashmap;

/*


https://leetcode.com/problems/group-anagrams/description/

*/


import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if (strs == null) return list;
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                List<String> _list = new ArrayList<>();
                _list.add(s);
                map.put(sorted, _list);
            }

        }
        list.addAll(map.values());
        return list;
    }

}
