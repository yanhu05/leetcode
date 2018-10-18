package main.array;

/*

https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/description/

*/

public class XDeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length < 2) return false;
        Arrays.sort(deck);
        int len = 1;
        for (int i = 1; i < deck.length; i++) {
            if (deck[i] != deck[i - 1]) {
                break;
            }
            len++;
        }
        if (len == 1) return false;
        int partitionLen = 2;
        while (partitionLen <= len) {
            if (deck.length % partitionLen == 0) {
                boolean found = true;
                for (int i = 0; i < deck.length; i += partitionLen) {
                    int num = deck[i];
                    int start = i + 1;
                    int end = i + partitionLen;
                    while (start < end) {
                        if (num != deck[start]) {
                            found = false;
                            break;
                        }
                        start++;
                    }
                }
                if (found) return true;
            }
            partitionLen++;
        }
        return false;
    }
}
