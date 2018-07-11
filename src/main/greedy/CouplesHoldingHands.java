package main.greedy;
/*

https://leetcode.com/problems/couples-holding-hands/description/

misguided by the difficulty level. Tried to solve it using greedy or union find

Lesson learned:  Always try brute force first

O(n) solution using cyclic swapping

https://leetcode.com/problems/couples-holding-hands/discuss/113362/JavaC++-O(N)-solution-using-cyclic-swapping

*/

public class CouplesHoldingHands {

    public int minSwapsCouples(int[] row) {
        int cnt = 0;
        for (int i = 1; i < row.length; i = i + 2) {
            if (Math.abs(row[i] - row[i - 1]) == 1) {
                if ((row[i] > row[i - 1] && row[i] % 2 > 0) ||
                        (row[i] < row[i - 1] && row[i - 1] % 2 > 0)) {
                    continue;
                }
            }

            // found a non couple
            int target = row[i - 1] % 2 == 0 ? row[i - 1] + 1 : row[i - 1] - 1;
            for (int j = i + 1; j < row.length; j++) {
                if (row[j] == target) {
                    row[j] = row[i];
                    row[i] = target;
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}
