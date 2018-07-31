package main.greedy;
/*

https://leetcode.com/problems/stone-game/description/
It is a bad problem.  Alex can always win.
*/

public class StoneGame {
    public boolean stoneGame(int[] piles) {
        int pickHead = piles[0];
        int pickTail = piles[piles.length - 1];
        int sum = pickHead + pickTail;

        for (int i = 1; i < piles.length - 1; i++) {
            sum += piles[i];
            int tmp = pickHead;
            pickHead = pickTail + piles[i];
            pickTail = Math.max(tmp, pickTail);
        }

        int alex = Math.max(pickHead, pickTail);
        return (sum - alex) < alex;
    }
}
