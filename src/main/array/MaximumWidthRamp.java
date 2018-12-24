package main.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

https://leetcode.com/problems/maximum-width-ramp/

Thought process:
This is similar to Buy and Sell Stocks.
Max width is Max Profit except that max width has to be calculated using indices

*/

public class MaximumWidthRamp {

    public int maxWidthRamp(int[] A) {
        List<Position> list = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            list.add(new Position(i, A[i]));
        }
        Collections.sort(list, Comparator.comparingInt(a -> a.num));
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (Position p : list) {
            max = Math.max(p.index - min, max);
            min = Math.min(p.index, min);
        }

        return max;
    }


    class Position {
        int index;
        int num;

        Position(int index, int num) {
            this.index = index;
            this.num = num;
        }
    }
}
