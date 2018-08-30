package main.array;

/*

https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/

 */

public class LongestSubstringRepeatingCharacters {

    public int longestSubstring(String s, int k) {
        return dfs(0, s.length(), s, k);
    }

    private int dfs(int start, int end, String s, int k) {
        int[] map = new int[26];
        for (int i = start; i < end; i++) {
            char c = s.charAt(i);
            map[c - 'a'] += 1;
        }
        int pos = -1;
        for (int i = start; i < end; i++) {
            char c = s.charAt(i);
            if (map[c - 'a'] >= k) {
                continue;
            }
            pos = i;
            break;
        }
        if (pos == -1) {
            return end - start;
        }

        int left = dfs(start, pos, s, k);
        int right = dfs(pos + 1, end, s, k);

        return Math.max(left, right);
    }
}
