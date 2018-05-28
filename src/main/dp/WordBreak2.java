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
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String prefix = s.substring(0, i + 1);
            if (wordDict.contains(prefix)) {
                String suffix = s.substring(i + 1);
                List<String> _list = helper(prefix, suffix);
                list.addAll(_list);
            }
        }
        return list;
    }

    List<String> helper(String prefix, String s) {
        List<String> _list = new ArrayList<>();
        if (!canBreakDown(s, wordDict) && wordDict.contains(s)) {
            _list.add(new StringBuilder(prefix).append(" ").append(s).toString());
            return _list;
        }

        if (s.length() == 0) {
            _list.add(prefix);
            return _list;
        }
        for (int i = 0; i < s.length(); i++) {
            String word = s.substring(0, i + 1);
            if (wordDict.contains(word)) {
                String suffix = s.substring(i + 1);
                String _prefix = new StringBuilder(prefix).append(" ").append(word).toString();
                List<String> myList = helper(_prefix, suffix);
                _list.addAll(myList);
            }
        }
        return _list;
    }

    boolean canBreakDown(String string, List<String> wordDict) {
        for (int i = 0; i < string.length(); i++) {
            String word = string.substring(0, i + 1);
            if (!wordDict.contains(word)) {
                continue;
            }
            if (wordDict.contains(word) && i < string.length() - 1) {
                return true;
            }
        }
        return false;
    }
}
