package main.design;

import java.util.*;

/*

https://leetcode.com/problems/online-election/

 */
public class TopVotedCandidate {
    Map<Integer, Integer> counts = new HashMap();
    Map<Integer, Integer> timeMax = new HashMap();
    int[] times;

    public TopVotedCandidate(int[] persons, int[] times) {
        counts.put(persons[0], 1);
        timeMax.put(times[0], persons[0]);
        this.times = times;

        for (int i = 1; i < persons.length; i++) {
            if (counts.containsKey(persons[i])) {
                counts.put(persons[i], counts.get(persons[i]) + 1);
            } else {
                counts.put(persons[i], 1);
            }
            int cnt = counts.get(persons[i]);
            int lastMax = counts.get(timeMax.get(times[i - 1]));
            if (cnt >= lastMax) {
                timeMax.put(times[i], persons[i]);
            } else {
                timeMax.put(times[i], timeMax.get(times[i - 1]));
            }
        }
    }

    public int q(int t) {
     /*
        while(!timeMax.containsKey(t)){
            t--;
        }
       return timeMax.get(t);
      */
        int low = 0;
        int hi = times.length - 1;
        while (low < hi) {
            int mid = low + (hi - low) / 2;

            if (times[mid] == t) {
                return timeMax.get(t);
            } else if (t < times[mid]) {
                hi = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return timeMax.get(times[low - 1]);
    }
}
