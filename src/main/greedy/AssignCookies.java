package main.greedy;

import java.util.Arrays;
import java.util.Collections;


public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        if (g == null || s == null) return 0;
        int cnt = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        for (int i = 0; i < g.length; i++) {
            while (j < s.length) {
                if (g[i] <= s[j]) {
                    j++;
                    cnt++;
                    break;
                }
                j++;
            }
        }

        return cnt;
    }

    public int findContentChildrenBruteForce(int[] g, int[] s) {
        if (g == null || s == null) return 0;
        int cnt = 0;
        Integer[] _g = new Integer[g.length];

        for (int i = 0; i < g.length; i++) {
            _g[i] = g[i];
        }

        Integer[] _s = new Integer[s.length];
        for (int i = 0; i < s.length; i++) {
            _s[i] = s[i];
        }


        Arrays.sort(_g, Collections.reverseOrder());
        Arrays.sort(_s, Collections.reverseOrder());
        boolean[] assigned = new boolean[s.length];

        for (int i = 0; i < _g.length; i++) {
            for (int j = 0; j < _s.length; j++) {
                if (assigned[j] || _s[j] < _g[i]) continue;
                assigned[j] = true;
                cnt++;
                break;
            }
        }

        return cnt++;
    }
}
