package main.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*

https://leetcode.com/problems/reveal-cards-in-increasing-order/

Thought process

Just simulate how a card is revealed and then the next is moved to the end of the deck.

Everything falls into its slot when we just need to how to  insert card at 0, 2, 4, 6...

Input: [17,13,11,2,3,5,7]
Sorted: [2,3,5,7,11,13,17]
Output: [2,13,3,11,5,17,7]

 */
public class RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        int[] res = new int[deck.length];
        Queue<Integer> q = new LinkedList();
        Arrays.sort(deck);
        for (int i = 0; i < deck.length; i++) {
            q.offer(i);
        }
        for (int card : deck) {
            res[q.poll()] = card; // reveal card
            q.offer(q.poll());  // move to end of deck
        }
        return res;
    }
}
