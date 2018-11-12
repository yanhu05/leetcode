package main.array;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/minimum-area-rectangle/description/

Thought process
Always brute force it
Brute force is to find all triangles and find the min area;
Then how do we find a triangle?
We use use diagonals for example 1,1 and 5,5 pair require 1, 5 and 5, 1 to form a triangle.

 */
public class MinimumAreaRectangle {

    public int minAreaRect(int[][] points) {
        Set<Coordinates> set = new HashSet<>();
        for (int i = 0; i < points.length; i++) {
            Coordinates c = new Coordinates(points[i][0], points[i][1]);
            set.add(c);
        }
        int area = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            for (int j = i + 1; j < points.length; j++) {
                int x1 = points[j][0];
                int y1 = points[j][1];
                if (x == x1 || y == y1) continue;
                Coordinates a = new Coordinates(x, y1);
                Coordinates b = new Coordinates(x1, y);
                if (set.contains(a) && set.contains(b)) {
                    int _area = Math.abs(x - x1) * Math.abs(y - y1);
                    area = Math.min(area, _area);
                }
            }
        }

        return area < Integer.MAX_VALUE ? area : 0;
    }

    class Coordinates {
        int _x;
        int _y;

        Coordinates(int x, int y) {
            this._x = x;
            this._y = y;
        }

        public boolean equals(Object o) {
            Coordinates cor = (Coordinates) o;
            if (this == cor) return true;
            if (cor == null) return false;
            return this._x == cor._x && this._y == cor._y;
        }

        public int hashCode() {
            return this._x * this._y;
        }
    }
}
