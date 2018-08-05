package main.greedy;

import java.util.Arrays;

/*

https://leetcode.com/problems/boats-to-save-people/description/

Key observation:
Must be able to tell it is a DP or Greedy problem.
Once we know it is greedy, we can at least come up with a brute force solution.
The optimal solution requires discovering that the lightest person can be paired with anyone.
if he can go with the heaviest, he should or the heaviest gets his own boat.

Perhaps the only way to discover that is to try different ways on paper when time permits.

 */

public class BoatsSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            cnt++;
        }
        return cnt;
    }

    // Brute force. TLE
    public int numRescueBoatsTLE(int[] people, int limit) {
        Arrays.sort(people);
        boolean[] used = new boolean[people.length];
        int cnt = 0;
        for (int i = people.length - 1; i >= 0; i--) {
            if (used[i]) continue;
            int diff = limit - people[i];
            used[i] = true;
            int j = i - 1;
            while (j >= 0) {
                if (used[j] || people[j] > diff) {
                    j--;
                    continue;
                }
                used[j] = true;
                break;
            }
            cnt++;
        }
        return cnt;
    }
}
