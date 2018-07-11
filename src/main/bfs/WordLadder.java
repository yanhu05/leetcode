package main.bfs;

/*

https://leetcode.com/problems/word-ladder/description/

Thought process:

Need to able to see it is a unweighted graph.  So a simple BFS would work

Bellman–Ford is good for negative weighted edges O(VE)
Dijkstra’s is good for non-negative weighted edges O(VlogV)

*/


import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || !wordList.contains(endWord)) return 0;
        Queue<String> q = new LinkedList();
        Set<String> visited = new HashSet<>();
        Map<String, List<String>> map = buildGraph(wordList);
        for (String word : wordList) {
            if (oneDiff(beginWord, word)) {
                q.add(word);
            }
        }
        if (q.isEmpty()) return 0;
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String word = q.poll();
                if (word.equals(endWord)) return ++level;
                if (visited.add(word)) {
                    List<String> adjList = map.get(word);
                    adjList.stream().forEach(w -> q.offer(w));
                }
            }
            level++;
        }
        return level;
    }

    private Map<String, List<String>> buildGraph(List<String> wordList) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : wordList) {
            for (String _word : wordList) {
                if (!word.equals(_word) && oneDiff(word, _word)) {
                    List<String> adjList = map.getOrDefault(word, new ArrayList<>());
                    adjList.add(_word);
                    map.put(word, adjList);
                }
            }
        }
        return map;
    }

    private boolean oneDiff(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }
}
