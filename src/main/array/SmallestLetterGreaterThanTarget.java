package main.array;

/*
https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

 */

public class SmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        int pos = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == letters[mid]) {
                pos = mid;
                break;
            } else if (target > letters[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (pos != -1) {
            for (int i = pos; i < letters.length; i++) {
                if (letters[i] != target) return letters[i];
            }
            return letters[0];
        }

        if (low > 0 && low < letters.length) {
            return letters[low];
        }

        return letters[0];
    }
}
