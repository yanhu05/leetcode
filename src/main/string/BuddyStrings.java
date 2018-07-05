package main.string;

import java.util.HashSet;
import java.util.Set;

/*

https://leetcode.com/problems/buddy-strings/description/

Brute force runs O(n^3)

This is O(n) time and O(n) space

Thought process:
No special data structures or algo needed.  Just need to spot 2 different use cases.

*/


public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) return false;
        char[] firstString = A.toCharArray();
        if (A.equals(B)) {
            Set<Character> uChars = new HashSet<>();
            for (char c : firstString) {
                if (!uChars.add(c)) {
                    return true;
                }
            }
        } else {
            int firstPos = -1;
            int secondPos = -1;
            int cnt = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == B.charAt(i)) continue;
                cnt++;
                if (cnt > 2) return false;
                if (cnt == 1) firstPos = i;
                if (cnt == 2) secondPos = i;
            }
            return A.charAt(firstPos) == B.charAt(secondPos) && B.charAt(firstPos) == A.charAt(secondPos);
        }
        return false;
    }

}
