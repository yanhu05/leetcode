package main.dp;

import java.util.*;

public class WordBreak2 {

    Map<String, List<String>> suffixMap = new HashMap<>();
    List<String> wordDict;

    public List<String> wordBreak(String s, List<String> wordDict) {
        this.wordDict = wordDict;
        if (s == null) {
            return Collections.emptyList();
        }
        List<String> _list = helper(s);
        return _list;
    }

    List<String> helper(String s) {
        if (suffixMap.containsKey(s)) {
            return suffixMap.get(s);
        }
        List<String> _list = new ArrayList<>();
        if (s.length() == 0) {
            _list.add("");
            return _list;
        }
        for (int i = 0; i < s.length(); i++) {
            String word = s.substring(0, i + 1);
            if (wordDict.contains(word)) {
                String suffix = s.substring(i + 1);
                List<String> subList = helper(suffix);
                for (String w : subList) {
                    StringBuilder sb = new StringBuilder(word);
                    if (w.length() > 0) {
                        sb.append(" ").append(w);
                    }
                    _list.add(sb.toString());
                }
            }
        }
        suffixMap.put(s, _list);
        return _list;
    }
}
