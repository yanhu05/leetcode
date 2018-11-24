package main.array;

/*


https://leetcode.com/problems/maximize-distance-to-closest-person/


*/

public class MaximizeDistanceClosestPerson {

    // O(n)
    public int maxDistToClosest(int[] seats) {
        int res = 0;
        int firstOne = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) continue;
            firstOne = i;
            res = firstOne;
            break;
        }
        int secondOne = firstOne + 1;

        while (secondOne < seats.length) {
            if (seats[secondOne] == 1) {
                int distance = (secondOne - firstOne) / 2;
                res = Math.max(distance, res);
                firstOne = secondOne;
            }
            secondOne++;
        }

        if (seats[secondOne] == 0) {
            int distance = secondOne - firstOne;
            res = Math.max(distance, res);
        }
        return res;
    }


    // accepted brute force O(n^2) solution
    public int maxDistToClosestBF(int[] seats) {
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) continue;
            int leftCloest = Integer.MAX_VALUE;
            int currPos = i - 1;
            while (currPos >= 0) {
                if (seats[currPos] == 1) {
                    leftCloest = i - currPos;
                    break;
                }
                currPos--;
            }
            currPos = i + 1;
            int rightCloest = Integer.MAX_VALUE;
            while (currPos < seats.length) {
                if (seats[currPos] == 1) {
                    rightCloest = currPos - i;
                    break;
                }
                currPos++;
            }
            res = Math.max(res, Math.min(leftCloest, rightCloest));
        }
        return res;
    }

}



